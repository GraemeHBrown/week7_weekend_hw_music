package shop;

import shop.item.ISell;

import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;

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
}
