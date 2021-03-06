package shop.item.accessories;

public class Drumstick extends Accessory {

    private String woodType;
    private String tipMaterial;

    public Drumstick(String itemDescription, double wholesalePrice, AccessoryType accessoryType, String woodType, String tipMaterial) {
        super(itemDescription, wholesalePrice, accessoryType);
        this.woodType = woodType;
        this.tipMaterial = tipMaterial;
    }


    public String getWoodType() {
        return this.woodType;
    }

    public String getTipMaterial() {
        return this.tipMaterial;
    }
}
