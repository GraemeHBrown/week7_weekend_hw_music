package shop;

import shop.item.ISell;
import shop.item.Item;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Shop {
    private ArrayList<ISell> stock;
    private ArrayList<Item> stockItems;

    public Shop(){
        this.stock = new ArrayList<>();
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
        for(ISell item: stock){
            potentialProfit += item.calculateMarkup();
        }
        return potentialProfit;
    }

    public ArrayList<Item> getStockItems() {
        List<Item> items = stock.stream()
                .map(Item.class::cast)
                .collect(toList());
        return (ArrayList<Item>) items;
    }
}
