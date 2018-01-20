package shop.item.instrument;

import shop.item.Item;

public abstract class Instrument extends Item implements IPlayable {

    private String colour;
    private InstrumentType type;

    public Instrument(double wholesalePrice, String itemDescription, String colour, InstrumentType type){
        super(itemDescription, wholesalePrice);
        this.colour = colour;
        this.type = type;
    }

    public InstrumentType getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public Instrument getItemTypeInformation(){
        return this;
    }
}
