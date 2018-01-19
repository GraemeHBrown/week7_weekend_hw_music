import item.accessories.GuitarString;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {

    GuitarString guitarString;

    @Before
    public void before(){
        guitarString = new GuitarString("Guitar strings", 6.00, "Guitar strings", 6,"9-42");
        guitarString.setRetailPrice(8.00);
    }

    @Test
    public void guitarStringHasItemDescription(){
        assertEquals("Guitar strings", guitarString.getItemDescription() );
    }

    @Test
    public void guitarStringHasWholesalePrice(){
        assertEquals(6.00, guitarString.getWholesalePrice(), 00.00);
    }

    @Test
    public void guitarStringHasAccessoryType(){
        assertEquals("Guitar strings", guitarString.getAccessoryType());
    }

    @Test
    public void guitarStringHasNumberInPacket(){
        assertEquals(6, guitarString.getNumberInPacket());
    }

    @Test
    public void guitarStringHasGuageRangeValue(){
        assertEquals("9-42", guitarString.getGuageRange());
    }

    @Test
    public void canCalculateMarkupOnGuitarStrings(){
        assertEquals(2.00, guitarString.calculateMarkup(), 0.00);
    }
}
