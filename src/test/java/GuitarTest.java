import behaviours.IPlay;
import enums.Brand;
import enums.InstrumentType;
import enums.Material;
import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar1;

    @Before
    public void setUp(){
        guitar1 = new Guitar(InstrumentType.GUITAR, Brand.FENDER, Material.WOOD,
                "Black", 250, 450, "Bass", "Electric",
                6, "Right", true);
    }

    @Test
    public void canPlayGuitar(){
    assertEquals("strum",guitar1.play());
    }

    @Test
    public void canGetGuitarBrand(){
        assertEquals(Brand.FENDER,guitar1.getBrand());
    }

    @Test
    public void canGetNumOfStrings(){
        assertEquals(6,guitar1.getNumOfStrings());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(200,guitar1.calculateMarkup());
    }

}
