package instruments;

import enums.Brand;
import enums.InstrumentType;
import enums.Material;

public class Drum extends Instrument {

    private String category;
    private int numOfDrums;
    private String amplification;
    private int pedals;
    private int symbols;
    private int drumSize;

    public Drum(InstrumentType type, Brand brand, Material material, String colour, int buyPrice, int sellPrice,
                String category,
                int numOfDrums,
                String amplification,
                int pedals,
                int symbols,
                int drumSize) {
        super(type,brand,material,colour,buyPrice,sellPrice);
        this.category = category;
        this.numOfDrums = numOfDrums;
        this.amplification = amplification;
        this.pedals = pedals;
        this.symbols = symbols;
        this.drumSize = drumSize;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getNumOfDrums() {
        return numOfDrums;
    }

    public void setNumOfDrums(int numOfDrums) {
        this.numOfDrums = numOfDrums;
    }

    public String getAmplification() {
        return amplification;
    }

    public void setAmplification(String amplification) {
        this.amplification = amplification;
    }

    public int getPedals() {
        return pedals;
    }

    public void setPedals(int pedals) {
        this.pedals = pedals;
    }

    public int getSymbols() {
        return symbols;
    }

    public void setSymbols(int symbols) {
        this.symbols = symbols;
    }

    public int getDrumSize() {
        return drumSize;
    }

    public void setDrumSize(int drumSize) {
        this.drumSize = drumSize;
    }

    @Override
    public String play() {
        return "bang";
    }
}
