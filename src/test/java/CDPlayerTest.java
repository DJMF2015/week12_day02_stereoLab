import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer player;
    CD disk;
    @Before
    public void before(){
        player = new CDPlayer("JVC", "1" );
        disk = new CD("KAboom", "Gorillaz");
    }


    @Test
    public void hasModel(){
        assertEquals("1", player.getModel());
    }

    @Test
    public void hasMake(){
        assertEquals("JVC", player.getMake());
    }

    @Test
    public void canPlayMusic(){
        assertEquals("MUSIC", player.playMusic());
    }
    @Test
    public void canLoadCD(){
        player.addCDToPlayer(disk);
        assertEquals(1, player.getSelectionSize());
    }
}
