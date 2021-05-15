import accessories.Accessory;
import enums.AccessoryType;
import enums.Brand;
import enums.InstrumentType;
import enums.Material;
import instruments.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    MusicShop shop;
    Instrument instrument1;
    Accessory accessory1;
    Instrument instrument2;
    Accessory accessory2;
    Instrument instrument3;
    Accessory accessory3;
    Instrument instrument4;
    Accessory accessory4;
    Instrument instrument5;
    Accessory accessory5;

    @Before
    public void setUp(){
        shop = new MusicShop("Mikes Music",1000);
        instrument1 = new Guitar(InstrumentType.GUITAR, Brand.FENDER, Material.WOOD,
                "Black", 250, 450, "Bass", "Electric",
                6, "Right", true);
        instrument2 = new Drum(InstrumentType.DRUM, Brand.PEARL, Material.MIXED,
                "Black", 300,450,"Bongos",
                4,"Acoustic",2,4,16);
        instrument3 = new Piano(InstrumentType.PIANO, Brand.ROLAND, Material.PLASTIC,"White",
                1000,1500,"Upright","Electric",
                88,"Hammer");
        instrument4 = new Saxophone(InstrumentType.SAXOPHONE, Brand.YAMAHA, Material.BRASS,
                "Golden",250,350,8,true,
                "Shine","Alto");
        instrument5 = new Guitar(InstrumentType.GUITAR, Brand.GIBSON, Material.WOOD,
                "White", 500, 1500, "Rock", "Electric",
                6, "Right", false);
        accessory1 = new Accessory(AccessoryType.STRAP,InstrumentType.GUITAR, Brand.GIBSON,5,10);
        accessory2 = new Accessory(AccessoryType.BAG,InstrumentType.GUITAR, Brand.FENDER,15,35);
        accessory3 = new Accessory(AccessoryType.DRUMSTICKS,InstrumentType.DRUM, Brand.PEARL,3,9);
        accessory4 = new Accessory(AccessoryType.HEADPHONES,InstrumentType.PIANO, Brand.CASIO,30,60);
        accessory5 = new Accessory(AccessoryType.STAND,InstrumentType.SAXOPHONE, Brand.STAGG,15,25);
        shop.addInstrument(instrument1);
        shop.addInstrument(instrument2);
        shop.addInstrument(instrument3);
        shop.addInstrument(instrument4);
        shop.addInstrument(instrument5);
        shop.addAccessory(accessory1);
        shop.addAccessory(accessory2);
        shop.addAccessory(accessory3);
        shop.addAccessory(accessory4);
        shop.addAccessory(accessory5);
    }

    @Test
    public void canCountInstrumentStock(){
        assertEquals(5,shop.getInstruments().size());
    }

    @Test
    public void canCountAccessoryStock(){
        assertEquals(5,shop.getAccessories().size());
    }
}
