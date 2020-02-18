package pou;

public class Activity {
    //create object attribut
    Attribut at = new Attribut();

    //makan
    public void makan(double makanInput){
        //jika sudah lebih dari 50
        if(at.getFull() >= 50){
            System.out.println(at.getName() + ": " + "\" Maaf aku masih kenyang \" ");
        }

        //
        else{
            at.plusEnergy(makanInput/10);
            at.plusFull(makanInput);
            at.setCleanest(false);
            System.out.println(at.getName() + ": " + "\" nyam..nyam..nyam, enak ! \"");
        }
    }

    //tidur
    public void tidur(double tidurInput){
        //jika sudah tidak ngantuk
        if(at.getEnergy() >= 50){
            System.out.println(at.getName() + ": " + "\" Maaf aku belum ngantuk \" ");
        }

        at.plusEnergy(tidurInput * 60/100);
        at.minusFull(tidurInput * 60/100);
        at.setCleanest(false);
        System.out.println(at.getName() + ": " + "\" Enak Sekali tidur \" ");
    }

    //mandi
    public void mandi(double mandiInput){
        //jika mandi lebih dari 10 menit
        if(mandiInput > 10){
            at.minusHealty(1);
        }
        at.setCleanest(true);
        System.out.println(at.getName() + ": " + "\" Enak Sekali mandi \" ");
    }

    //main
    public void main(double mainInput){
        at.minusEnergy(mainInput);
        at.setCleanest(false);
        System.out.println(at.getName() + ": " + "\" Asikk Bermain \" ");
    }

    //obat
    public void obat(double obatInput){
        at.plusHealty(obatInput);
        System.out.println(at.getName() + ": " + "\" Terima Kasih sudah memberiku obat \" ");
    }



    //cek keadaan
    public void keadaan(){
        System.out.println("+==================+");
        System.out.println("Keadaan " + at.getName());
        System.out.println("+==================+");
        System.out.println("Badan     : " + (at.isCleanest()? "Bersih" : "Kotor") );
        System.out.println("Kesehatan : " + at.getHealty());
        System.out.println("Energy    : " + at.getEnergy());
        System.out.println("kenyang   : " + at.getFull());
        System.out.println("+==================+");
    }
}
