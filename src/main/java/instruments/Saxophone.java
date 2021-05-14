package instruments;

import enums.Brand;
import enums.InstrumentType;
import enums.Material;

public class Saxophone extends Instrument {

    private int numOfValves;
    private Boolean mouthpiece;
    private String finish;
    private String range;

    public Saxophone(InstrumentType type, Brand brand, Material material, String colour, int buyPrice, int sellPrice,
                     int numOfValves,
                     Boolean mouthpiece,
                     String finish,
                     String range){
        super(type,brand,material,colour,buyPrice,sellPrice);
        this.numOfValves = numOfValves;
        this.mouthpiece = mouthpiece;
        this.finish = finish;
        this.range = range;
    }

    public int getNumOfValves() {
        return numOfValves;
    }

    public void setNumOfValves(int numOfValves) {
        this.numOfValves = numOfValves;
    }

    public Boolean getMouthpiece() {
        return mouthpiece;
    }

    public void setMouthpiece(Boolean mouthpiece) {
        this.mouthpiece = mouthpiece;
    }

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    @Override
    public String play() {
        return "hoot";
    }
}
