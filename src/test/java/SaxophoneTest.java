import enums.Brand;
import enums.InstrumentType;
import enums.Material;
import instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone1;

    @Before
    public void setUp(){
        saxophone1 = new Saxophone(InstrumentType.SAXOPHONE, Brand.YAMAHA, Material.BRASS,
                "Golden",250,350,8,true,
                "Shine","Alto");
    }

    @Test
    public void canPlaySax(){
        assertEquals("hoot",saxophone1.play());
    }
    @Test
    public void canGetBrand(){
        assertEquals(Brand.YAMAHA,saxophone1.getBrand());
    }

    @Test
    public void canGetFinish(){
        assertEquals("Shine",saxophone1.getFinish());
    }

    @Test
    public void canCalculateSaxMarkup(){
        assertEquals(100,saxophone1.calculateMarkup());
    }
}
