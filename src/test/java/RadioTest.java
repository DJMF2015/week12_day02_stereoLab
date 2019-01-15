import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before(){
        radio = new Radio("JVC", "1");
    }

    @Test
    public void hasModel(){
        assertEquals("1", radio.getModel());
    }

    @Test
    public void hasMake(){
        assertEquals("JVC", radio.getMake());
    }

    @Test
    public void canPlayMusic(){
        assertEquals("MUSIC", radio.playMusic());
    }

    @Test
    public void canBeTuned(){
        assertEquals("Radio 1", radio.tuneRadio());
    }
}
