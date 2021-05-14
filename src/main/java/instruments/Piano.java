package instruments;

import enums.Brand;
import enums.InstrumentType;
import enums.Material;

public class Piano extends Instrument {

    private String category;
    private String amplification;
    private int numOfKeys;
    private String keyAction;

    public Piano(InstrumentType type, Brand brand, Material material, String colour, int buyPrice, int sellPrice,
                 String category,
                 String amplification,
                 int numOfKeys,
                 String keyAction){
        super(type,brand,material,colour,buyPrice,sellPrice);
        this.category = category;
        this.amplification = amplification;
        this.numOfKeys = numOfKeys;
        this.keyAction = keyAction;

    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAmplification() {
        return amplification;
    }

    public void setAmplification(String amplification) {
        this.amplification = amplification;
    }

    public int getNumOfKeys() {
        return numOfKeys;
    }

    public void setNumOfKeys(int numOfKeys) {
        this.numOfKeys = numOfKeys;
    }

    public String getKeyAction() {
        return keyAction;
    }

    public void setKeyAction(String keyAction) {
        this.keyAction = keyAction;
    }

    @Override
    public String play() {
        return "plonk";
    }
}
