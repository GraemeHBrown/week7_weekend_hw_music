package shop.item.accessories;

import shop.item.Item;

public abstract class Accessory extends Item {

    private AccessoryType accessoryType;

    public Accessory(String itemDescription, double wholesalePrice, AccessoryType accessoryType) {
        super(itemDescription, wholesalePrice);
        this.accessoryType = accessoryType;
    }


    public AccessoryType getAccessoryType() {
        return this.accessoryType;
    }

    public Accessory getItemTypeInformation(){
        return this;
    }
}


