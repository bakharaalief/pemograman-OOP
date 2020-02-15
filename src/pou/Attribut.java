package pou;

public class Attribut {
    //declare
    private String name;
    private double energy;
    private boolean cleanest;
    private double happinest;
    private double full;


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

    public double getEnergy() {
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

    public double getHappinest() {
        return happinest;
    }

    //full
    public void plusFull(int full) {
        this.full += full;
    }

    public double getFull() {
        return full;
    }

}
