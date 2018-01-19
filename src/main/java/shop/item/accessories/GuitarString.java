package shop.item.accessories;

public class GuitarString extends Accessory {
    private int numberInPacket;
    private String guageRange;

    public GuitarString(String itemDescription, double wholesalePrice, AccessoryType accessoryType, int numberInPacket, String guageRange) {
        super(itemDescription, wholesalePrice, accessoryType);
        this.numberInPacket = numberInPacket;
        this.guageRange = guageRange;
    }

    public int getNumberInPacket() {
        return this.numberInPacket;
    }

    public String getGuageRange() {
        return this.guageRange;
    }
}
