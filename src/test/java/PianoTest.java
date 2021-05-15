import enums.Brand;
import enums.InstrumentType;
import enums.Material;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano1;

    @Before
    public void setUp(){
        piano1 = new Piano(InstrumentType.PIANO, Brand.ROLAND, Material.PLASTIC,"White",
                1000,1500,"Upright","Electric",
                88,"Hammer");
    }

    @Test
    public void canPlayPiano(){
        assertEquals("plonk",piano1.play());
    }

    @Test
    public void canGetMaterial(){
        assertEquals(Material.PLASTIC,piano1.getMaterial());
    }

    @Test
    public void canGetKeyAction(){
        assertEquals("Hammer",piano1.getKeyAction());
    }

    @Test
    public void canCalculatePianoMarkup(){
        assertEquals(500,piano1.calculateMarkup());
    }
}

