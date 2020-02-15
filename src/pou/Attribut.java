package pou;

public class Attribut {
    //declare
    private String name;
    private int energy;
    private boolean cleanest;
    private int happinest;
    private int full = 0;


    //constructor
    public Attribut(){
        name = "kosong";
        energy = 0;
        cleanest = false;
        happinest = 0;
        full = 0;
    }

    //name
    public void setName(String nama) {
        this.name = nama;
    }

    public String getName() {
        return name;
    }

    //energi
    public void plusEnergy(int energy) {
        this.energy += energy;
    }

    public int getEnergy() {
        return energy;
    }

    //cleanest
    public void setCleanest(boolean cleanest) {
        this.cleanest = cleanest;
    }

    public boolean isCleanest() {
        return cleanest;
    }

    //happinest
    public void plusHappinest(int happinest){
        this.happinest += happinest;
    }

    public int getHappinest() {
        return happinest;
    }

    //full
    public void plusFull(int full) {
        this.full += full;
    }

    public int getFull() {
        return full;
    }

}
