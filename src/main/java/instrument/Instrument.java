package instrument;

public abstract class Instrument implements IPlayable {

    private String colour;
    private InstrumentType type;

    public Instrument(String colour, InstrumentType type){
        this.colour = colour;
        this.type = type;
    }

    public InstrumentType getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }
}
