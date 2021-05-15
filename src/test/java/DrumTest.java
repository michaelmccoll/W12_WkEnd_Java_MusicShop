import enums.Brand;
import enums.InstrumentType;
import enums.Material;
import instruments.Drum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    Drum drum1;

    @Before
    public void setUp(){
        drum1 = new Drum(InstrumentType.DRUM, Brand.PEARL, Material.MIXED,
                "Black", 300,450,"Bongos",
                4,"Acoustic",2,4,16);
    }

    @Test
    public void canPlayDrum(){
        assertEquals("bang",drum1.play());
    }

    @Test
    public void canGetSymbols(){
        assertEquals(4,drum1.getSymbols());
    }

    @Test
    public void canGetMaterial(){
        assertEquals(Material.MIXED,drum1.getMaterial());
    }

    @Test
    public void canCalculateDrumMarkup(){
        assertEquals(150,drum1.calculateMarkup());
    }
}
