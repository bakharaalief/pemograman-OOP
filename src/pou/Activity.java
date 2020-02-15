package pou;

public class Activity {
    //create object attribut
    Attribut at = new Attribut();

    //ngasih nama
    public void nama(String namaInput){
        at.setName(namaInput);
        System.out.println("Selamat datang, " + namaInput);
    }

    //ngasih makan
    public void makan(int makanInput){
        at.plusHappinest(5);
        at.plusEnergy(makanInput/100);
        at.plusFull(makanInput);
        at.setCleanest(false);
        System.out.println("diberi makan sebanyak " + makanInput + " makanan" );
    }

    //ngasih mandi
    public void mandi(){
        at.plusHappinest(5);
        at.setCleanest(true);
        System.out.println("Dimandikan");
    }

    //ngasih tidur
    public void tidur(){
        at.plusHappinest(5);
        at.plusEnergy(10);
        System.out.println("Ditidurkan");
    }

    //cek keadaan
    public void keadaan(){
        System.out.println("+==================+");
        System.out.println("Keadaan " + at.getName());
        System.out.println("+==================+");
        System.out.println("Nama    : " + at.getName());
        System.out.println("Bahagia : " + at.getHappinest());
        System.out.println("Badan  : " + (at.isCleanest()? "Bersih" : "Kotor") );
        System.out.println("Energy  : " + at.getEnergy());
        System.out.println("kenyang : " + at.getFull());
        System.out.println("+==================+");
    }
}
