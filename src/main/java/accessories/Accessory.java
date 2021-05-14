package accessories;

import enums.Brand;
import enums.InstrumentType;

public class Accessory {

    private InstrumentType instrument;
    private Brand brand;
    private int buyPrice;
    private int sellPrice;

    public Accessory(InstrumentType instrument, Brand brand, int buyPrice, int sellPrice){
        this.instrument = instrument;
        this.brand = brand;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }
}
