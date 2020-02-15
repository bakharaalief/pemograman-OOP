package pou;

public class Activity {
    //ngambil attribut
    Attribut at = new Attribut();

    //ngasih nama
    public void nama(String namaInput){
        at.setName(namaInput);
        System.out.println("ngasih nama");
    }

    //ngasih makan
    public void makan(){
        at.setHappinest(5);
        at.setFull(10);
        System.out.println("ngasih makan");
    }

    //ngasih mandi
    public void mandi(){
        at.setHappinest(5);
        at.setCleanest(true);
        System.out.println("ngasih mandi");
    }

    //ngasih tidur
    public void tidur(){
        at.setHappinest(5);
        at.setEnergy(10);
        System.out.println("ngasih tidur");
    }

    //cek keadaan
    public void keadaan(){
        System.out.println("Nama    : " + at.getName());
        System.out.println("Bahagia : " + at.getHappinest());
        System.out.println("Bersih  : " + at.isCleanest());
        System.out.println("Energy  : " + at.getEnergy());
        System.out.println("kenyang : " + at.getFull());
    }
}
