package instruments;

import behaviours.IPlay;
import behaviours.ISell;
import enums.Brand;
import enums.InstrumentType;
import enums.Material;

public abstract class Instrument implements IPlay, ISell {

    private InstrumentType type;
    private Brand brand;
    private Material material;
    private String colour;
    private int buyPrice;
    private int sellPrice;

public Instrument(InstrumentType type, Brand brand, Material material, String colour, int buyPrice, int sellPrice){
    this.type = type;
    this.brand = brand;
    this.material = material;
    this.colour = colour;
    this.buyPrice = buyPrice;
    this.sellPrice = sellPrice;
}
    public InstrumentType getType() {
        return type;
    }

    public void setType(InstrumentType type) {
        this.type = type;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
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
