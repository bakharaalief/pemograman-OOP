package pou;

public class Attribut {

    //constructor
    public Attribut(){

    }

    //name
    private String name = "kosong";

    public void setName(String nama) {
        this.name = nama;
    }

    public String getName() {
        return name;
    }

    //energi
    private int energy = 0;

    public void setEnergy(int energy) {
        this.energy += energy;
    }

    public int getEnergy() {
        return energy;
    }

    //cleanest
    private boolean cleanest = false;

    public void setCleanest(boolean cleanest) {
        this.cleanest = cleanest;
    }

    public boolean isCleanest() {
        return cleanest;
    }

    //happinest
    private int happinest = 0;

    public void setHappinest(int happinest){
        this.happinest += happinest;
    }

    public int getHappinest() {
        return happinest;
    }

    //full
    private int full = 0;

    public void setFull(int full) {
        this.full += full;
    }

    public int getFull() {
        return full;
    }

}
