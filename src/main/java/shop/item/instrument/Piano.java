package shop.item.instrument;

public class Piano extends Instrument {


    private int numberOfKeys;
    private String pedalType;

    public Piano(double wholeSalePrice, String itemDescription, String colour,InstrumentType type, int numberOfKeys, String pedalType){
        super(wholeSalePrice, itemDescription,colour, type);
        this.numberOfKeys = numberOfKeys;
        this.pedalType = pedalType;
    }

    @Override
    public String play() {
        return "Piano playing";
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String getPedalType() {
        return pedalType;
    }

}
