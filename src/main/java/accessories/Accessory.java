package accessories;

import behaviours.ISell;
import enums.AccessoryType;
import enums.Brand;
import enums.InstrumentType;

public class Accessory implements ISell {

    private AccessoryType type;
    private InstrumentType instrument;
    private Brand brand;
    private int buyPrice;
    private int sellPrice;

    public Accessory(AccessoryType type, InstrumentType instrument, Brand brand, int buyPrice, int sellPrice){
        this.type = type;
        this.instrument = instrument;
        this.brand = brand;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public AccessoryType getType() {
        return type;
    }

    public void setType(AccessoryType type) {
        this.type = type;
    }
    public InstrumentType getInstrument() {
        return instrument;
    }

    public void setInstrument(InstrumentType instrument) {
        this.instrument = instrument;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }

    @Override
    public int calculateMarkup() {
        return this.sellPrice - this.buyPrice;
    }
}
