import shop.item.instrument.InstrumentType;
import shop.item.instrument.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano(15000.00,"Piano","Black", InstrumentType.KEYBOARD,88, "Damper silencing stop");
    }

    @Test
    public void pianoCanPlay(){
        assertEquals("Piano playing", piano.play());
    }

    @Test
    public void pianoHasNumberOfKeys(){
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void pianoHasPedalType(){
        assertEquals("Damper silencing stop", piano.getPedalType());
    }

    @Test
    public void pianoHasType(){
        assertEquals(InstrumentType.KEYBOARD, piano.getType());
    }

    @Test
    public void pianoHasColour(){
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void pianoHasItemDescription(){
        assertEquals("Piano", piano.getItemDescription());
    }

    @Test
    public void pianoHasWholesalePrice(){
        assertEquals(15000.00, piano.getWholesalePrice(),00.00);
    }

    @Test
    public void pianoHasRetailPrice(){
        piano.setRetailPrice(17000.00);
        assertEquals(17000.00, piano.getRetailPrice(),00.00);
    }
}
