package item.accessories;

import item.Item;

public abstract class Accessory extends Item {

    private String accessoryType;

    public Accessory(String itemDescription, double wholesalePrice, String accessoryType) {
        super(itemDescription, wholesalePrice);
        this.accessoryType = accessoryType;
    }


    public String getAccessoryType() {
        return this.accessoryType;
    }
}

//TODO turn accessoryType into ENUM
