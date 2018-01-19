package item.accessories;

public class GuitarString {
    private int numberInPacket;
    private String guageRange;

    public GuitarString(int numberInPacket, String guageRange){
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
