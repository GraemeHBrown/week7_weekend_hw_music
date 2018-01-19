import shop.item.accessories.Drumstick;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DrumStickTest {
    Drumstick drumStick;

    @Before
    public void before(){
        drumStick = new Drumstick("Drum sticks", 12.00, "Drum sticks", "Hickory", "wood");
        drumStick.setRetailPrice(14.00);
    }

    @Test
    public void drumStickHasItemDescription(){
        assertEquals("Drum sticks", drumStick.getItemDescription() );
    }

    @Test
    public void drumStickHasWholesalePrice(){
        assertEquals(12.00, drumStick.getWholesalePrice(), 00.00);
    }

    @Test
    public void drumStickHasAccessoryType(){
        assertEquals("Drum sticks", drumStick.getAccessoryType());
    }

    @Test
    public void drumStickHasWoodType(){
        assertEquals("Hickory", drumStick.getWoodType());
    }

    @Test
    public void drumStickHasTipMaterial(){
        assertEquals("wood", drumStick.getTipMaterial());
    }

    @Test
    public void canCalculateMarkupOnDrumStick(){
        assertEquals(2.00, drumStick.calculateMarkup(), 0.00);
    }

}
