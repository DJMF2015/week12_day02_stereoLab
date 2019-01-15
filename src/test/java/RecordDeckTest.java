import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {

    RecordDeck recordDeck;

    @Before
    public void before(){
        recordDeck = new RecordDeck("Deck", "ZZ");
    }

    @Test
    public void hasModel(){
        assertEquals("ZZ", recordDeck.getModel());
    }

    @Test
    public void hasMake(){
        assertEquals("Deck", recordDeck.getMake());
    }

    @Test
    public void canPlayMusic(){
        assertEquals("MUSIC", recordDeck.playMusic());
    }
}
