import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StereoTest {

    Stereo stereo;
    Radio radio;
    CDPlayer player;
    RecordDeck recordDeck;

    @Before
    public void before(){
        recordDeck = new RecordDeck("Panasonic", "P45");
        player =  new CDPlayer("Sony", "2tr");
        radio = new Radio("JVC", "1");
        stereo = new Stereo("Davids Stereo", radio, player, recordDeck);
    }

    @Test
    public void getName() {
        assertEquals("Davids Stereo", stereo.getName());
    }

    @Test
    public void getRadio() {
        assertEquals(radio, stereo.getRadio());
    }

    @Test
    public void getPlayer() {
        assertEquals(player, stereo.getPlayer());
    }

    @Test
    public void getRecordDeck() {
        assertEquals(recordDeck, stereo.getRecordDeck());
    }

    @Test
    public void canTuneRadio(){
        assertEquals("Radio 1", stereo.tuneRadio(radio));
    }


}