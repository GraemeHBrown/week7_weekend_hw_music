import instrument.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano(88, "Damper silencing stop");
    }

    @Test
    public void pianoCanPlay(){
        assertEquals("instrument.Piano playing", piano.play());
    }

    @Test
    public void pianoHasNumberOfKeys(){
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void pianoHasPedalType(){
        assertEquals("Damper silencing stop", piano.getPedalType());
    }
}
