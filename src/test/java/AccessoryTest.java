import accessories.Accessory;
import enums.AccessoryType;
import enums.Brand;
import enums.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoryTest {

    Accessory accessory1;

    @Before
    public void setUp(){
        accessory1 = new Accessory(AccessoryType.STRAP,InstrumentType.GUITAR, Brand.GIBSON,5,10);
    }

    @Test
    public void canGetAccessoryType(){
        assertEquals(AccessoryType.STRAP,accessory1.getType());
    }

    @Test
    public void canCalculateAccessoryMarkup(){
        assertEquals(5,accessory1.calculateMarkup());
    }
}
