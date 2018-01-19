import instrument.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Martin 000-28", "Mahogany Blocks", "Hardwood", "Chrome tuning machine", 6);
    }

    @Test
    public void guitarCanPlay(){
        assertEquals("instrument.Guitar playing", guitar.play());
    }


    @Test
    public void guitarHasModel(){
        assertEquals("Martin 000-28", guitar.getModel());
    }

    @Test
    public void guitarHasBodyType(){
        assertEquals("Mahogany Blocks", guitar.getBodyType());
    }

    @Test
    public void guitarHasNeckType(){
        assertEquals("Hardwood", guitar.getNeckType());
    }

    @Test
    public void guitarHasHardware(){
        assertEquals("Chrome tuning machine", guitar.getHardware());
    }

    @Test
    public void guitarHasNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }


}
