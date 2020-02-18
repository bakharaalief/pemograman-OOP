package pou;

public class Attribut {
    //declare
    private String name;
    private double energy;
    private boolean cleanest;
    private double full;
    private double healty;


    //constructor
    public Attribut(){
        name = "Ayam";
        energy = 0;
        cleanest = false;
        healty = 0;
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
    public void plusEnergy(double energy) { this.energy += energy; };

    public void minusEnergy(double energy) { this.energy -= energy; };

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

    //full
    public void plusFull(double full) {
        this.full += full;
    }

    public void minusFull(double full) { this.full -= full; };

    public double getFull() {
        return full;
    }

    //healty
    public void plusHealty(double healty) { this.healty += healty; };

    public void minusHealty(double healty) { this.healty -= healty; };

    public double getHealty() {return healty;};

}
