import item.accessories.GuitarString;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {

    GuitarString guitarString;

    @Before
    public void before(){
        guitarString = new GuitarString(6, "9-42");
    }

    @Test
    public void guitarStringHasNumberInPacket(){
        assertEquals(6, guitarString.getNumberInPacket());
    }

    @Test
    public void guitarStringHasGuageRangeValue(){
        assertEquals("9-42", guitarString.getGuageRange());
    }
}
