package instruments;

import enums.Brand;
import enums.InstrumentType;
import enums.Material;

public class Guitar extends Instrument {

    private String category;
    private String amplification;
    private int numOfStrings;
    private String handed;
    private Boolean strapIncluded;

    public Guitar(InstrumentType type, Brand brand, Material material, String colour, int buyPrice, int sellPrice,
                  String category,
                  String amplification,
                  int numOfStrings,
                  String handed,
                  Boolean strapIncluded){
        super(type,brand,material,colour,buyPrice,sellPrice);
        this.category = category;
        this.amplification = amplification;
        this.numOfStrings = numOfStrings;
        this.handed = handed;
        this.strapIncluded = strapIncluded;
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

    public int getNumOfStrings() {
        return numOfStrings;
    }

    public void setNumOfStrings(int numOfStrings) {
        this.numOfStrings = numOfStrings;
    }

    public String getHanded() {
        return handed;
    }

    public void setHanded(String handed) {
        this.handed = handed;
    }

    public Boolean getStrapIncluded() {
        return strapIncluded;
    }

    public void setStrapIncluded(Boolean strapIncluded) {
        this.strapIncluded = strapIncluded;
    }

    @Override
    public String play() {
        return "strum";
    }
}
