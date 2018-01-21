package shop;

import shop.item.ISell;
import shop.item.Item;
import shop.item.accessories.Accessory;
import shop.item.instrument.Instrument;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Shop {
    private ArrayList<ISell> stock;
    private ArrayList<ISell> soldItems;

    public Shop() {
        this.stock = new ArrayList<>();
        this.soldItems = new ArrayList<>();
    }

    public ArrayList<ISell> getStock() {
        return this.stock;
    }

    public int stockCount() {
        return this.stock.size();
    }

    public void addItemToStock(ISell item) {
        stock.add(item);
    }

    public void removeItemFromStock(ISell item) {
        stock.remove(item);
    }

    public double calculateTotalPotentialProfit() {
        double potentialProfit = 0;
        for (ISell item : stock) {
            potentialProfit += item.calculateMarkup();
        }
        return potentialProfit;
    }

    public double calculateTotalActualProfitFromSoldItems() {
        double actualProfit = 0;
        for(ISell item: soldItems){
            actualProfit += item.calculateActualProfit();
        }
        return actualProfit;
    }

    public ArrayList<Item> getStockItems() {
        List<Item> items = stock.stream()
                .map(Item.class::cast)
                .collect(toList());
        return (ArrayList<Item>) items;
    }

    public ArrayList<Item> getSoldItems() {
        List<Item> items = soldItems.stream()
                .map(Item.class::cast)
                .collect(toList());
        return (ArrayList<Item>) items;
    }

    public Item getItemType(Item item) {
        Item foundType = item.getItemTypeInformation();

        if(foundType.getClass().getSuperclass().getSimpleName().equals("Accessory")){
            return ((Accessory) foundType);
        } else {
            return ((Instrument) foundType);
        }

    }

    public void sellItem(ISell item) {
        removeItemFromStock(item);
        addToSoldItems(item);
    }

    private void addToSoldItems(ISell item) {
        soldItems.add(item);
    }

    public int soldItemsCount() {
        return this.soldItems.size();
    }

    public Map<String, Long> createCountOfSoldItemsByType() {
        ArrayList<String> itemsList = new ArrayList<>();
        ArrayList<Item> soldItems = getSoldItems();
        for (Item item : soldItems) {
            itemsList.add(item.getItemDescription());
        }
        Map<String, Long> soldCountMap = itemsList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return soldCountMap;
    }


}
