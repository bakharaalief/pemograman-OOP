package pulpenOOP;

public class Pulpen {
    /*deklarasi*/
    private String namaPulpen;
    Tinta tinta = new Tinta();

    /*constructor*/
    public Pulpen(String namaInput){
        namaPulpen = namaInput;
    }

    /*method dipakai*/
    public void diPakai(int jumlah){
        tinta.kurang(jumlah);
        System.out.println(namaPulpen + " : dipakai sebanyak " + jumlah );
    }

    /*method diisiulang*/
    public void diIsiUlang(int jumlah){
        tinta.tambah(jumlah);
        System.out.println(namaPulpen + " : diisi sebanyak " + jumlah );
    }

    /*mehtod infoPulpen*/
    public void infoPulpen(){
        tinta.infoTinta(namaPulpen);
    }

}
