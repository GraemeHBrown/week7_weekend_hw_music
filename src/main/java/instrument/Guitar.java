package instrument;

public class Guitar implements IPlayable {

    private String model;
    private String bodyType;
    private String neckType;
    private String hardware;
    private int numberOfStrings;

    public Guitar(String model, String bodyType, String neckType, String hardware, int numberOfStrings) {
        this.model = model;
        this.bodyType = bodyType;
        this.neckType = neckType;
        this.hardware = hardware;
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public String play() {
        return "instrument.Guitar playing";
    }

    public String getModel() {
        return this.model;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getNeckType() {
        return neckType;
    }

    public String getHardware() {
        return hardware;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
