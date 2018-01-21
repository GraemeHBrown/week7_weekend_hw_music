package shop.item;

import java.text.DecimalFormat;

public abstract class Item implements ISell {

    private String itemDescription;
    private double wholesalePrice;
    private double retailPrice;

    public Item(String itemDescription, double wholesalePrice) {
        this.itemDescription = itemDescription;
        this.wholesalePrice = wholesalePrice;
    }

    @Override
    public double calculateMarkup() {
        DecimalFormat format = new DecimalFormat("#.##");
        double markup = this.retailPrice - this.wholesalePrice;
        return Double.parseDouble(format.format(markup));
    }

    @Override
    public double calculateActualProfit() {
        DecimalFormat format = new DecimalFormat("#.##");
        double profit = this.retailPrice - this.wholesalePrice;
        return Double.parseDouble(format.format(profit));
    }

    public String getItemDescription() {
        return this.itemDescription;
    }

    public double getWholesalePrice() {
        return this.wholesalePrice;
    }

    public double getRetailPrice() {
        return this.retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public abstract Item getItemTypeInformation();
}
