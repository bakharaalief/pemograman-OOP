package pertemuan3;

public class SegiEmpat {
    public int panjang;
    public int lebar;

    //constructor
    public SegiEmpat(){

    }

    //setPanjang
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    //setLebar
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    //luas
    public int luas(){
        return panjang * lebar;
    }
}
