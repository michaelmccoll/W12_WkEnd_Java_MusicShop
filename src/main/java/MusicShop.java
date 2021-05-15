import accessories.Accessory;
import instruments.Instrument;

import java.util.ArrayList;

public class MusicShop {

    private String shopName;
    private ArrayList<Instrument> instruments;
    private ArrayList<Accessory> accessories;
    private int till;

    public MusicShop(String shopName, int till){
        this.shopName = shopName;
        this.instruments = new ArrayList<>();
        this.accessories = new ArrayList<>();
        this.till = till;
    }

    public void addInstrument(Instrument instrument){
        instruments.add(instrument);
    }

    public void addAccessory(Accessory accessory){
        accessories.add(accessory);
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public ArrayList<Instrument> getInstruments() {
        return instruments;
    }

    public void setInstruments(ArrayList<Instrument> instruments) {
        this.instruments = instruments;
    }

    public ArrayList<Accessory> getAccessories() {
        return accessories;
    }

    public void setAccessories(ArrayList<Accessory> accessories) {
        this.accessories = accessories;
    }

    public int getTill() {
        return till;
    }

    public void setTill(int till) {
        this.till = till;
    }
}
