package instrument;

public class Piano implements IPlayable {


    private int numberOfKeys;
    private String pedalType;

    public Piano(int numberOfKeys, String pedalType){
        this.numberOfKeys = numberOfKeys;
        this.pedalType = pedalType;
    }

    @Override
    public String play() {
        return "instrument.Piano playing";
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String getPedalType() {
        return pedalType;
    }

}
