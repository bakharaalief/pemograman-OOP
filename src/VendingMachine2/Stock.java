package VendingMachine2;

import java.util.ArrayList;

public class Stock {
    //declare
    private ArrayList<String> namaBarang = new ArrayList<>();
    private ArrayList<Double> hargaBarang = new ArrayList<>();
    private ArrayList<Integer> literBarang = new ArrayList<>();
    private ArrayList<Integer> stockBarang = new ArrayList<>();

    //getNamaBarang
    public String getNameBarang(int code){
        return namaBarang.get(code);
    }

    //getHargaBarang
    public double getHargaBarang(int code){
        return hargaBarang.get(code);
    }

    //getLiterBarang
    public int getLiterBarang(int code){
        return literBarang.get(code);
    }

    //getStockBarang
    public int getStockBarang(int code){
        return stockBarang.get(code);
    }

    //setDataBarang
    public void setStockBarang(int code, int jumlahStock){
        stockBarang.set(code, jumlahStock);
    }

    //listBarang
    public void listStock(){
        //banyak data
        int banyakData = namaBarang.size();

        //jika sudah terdapat data
        if(banyakData > 0){
            System.out.println("Code \t| Nama \t\t\t| harga\t\t| list\t|Stock");
            System.out.println("-----------------------------------------");

            //list barang yang akan ditampilkan
            for(int i = 0; i < banyakData; i++ ){
                System.out.println(
                        i + " \t\t| " + namaBarang.get(i) + " \t\t| " + hargaBarang.get(i) + " \t| " + literBarang.get(i) + " \t| " + stockBarang.get(i)
                );
            }

            System.out.println("-----------------------------------------");
        }

        else{
            System.out.println("Saat ini stock masih kosong");
        }
    }

    //total barang
    public int totalBarang(){
        //banyak data
        int banyakData = namaBarang.size();
        int seluruhBarang = 0;

        for(int i = 0; i < banyakData; i++ ){
            seluruhBarang += stockBarang.get(i);
        }

        return seluruhBarang;
    }

    //total liter
    public int totalLiter(){
        //banyak data
        int banyakData = namaBarang.size();
        int seluruhLiter = 0;

        for(int i = 0; i < banyakData; i++ ){
            seluruhLiter += literBarang.get(i) * stockBarang.get(i);
        }

        return seluruhLiter;
    }

    public void tambahStock(String namaBarang, double hargaBarang, int literBarang, int jumlahStock){
        //syarat harus dibawah 50 dan liter lebih dari 1000
        if( totalBarang() + jumlahStock <= 50 && totalLiter() + literBarang*jumlahStock <= 1000){
            this.namaBarang.add(namaBarang);
            this.hargaBarang.add(hargaBarang);
            this.literBarang.add(literBarang);
            this.stockBarang.add(jumlahStock);

            System.out.println(namaBarang + " Berhasil ditambah ke Stock ");
        }

        else{
            System.out.println(namaBarang + " Maaf gagal ditambah ke Stock karena Penuh ");
        }

    }

    public void updateStock(int code, String namaBarang, double hargaBarang, int literBarang, int jumlahStock){
        this.namaBarang.set(code, namaBarang);
        this.hargaBarang.set(code, hargaBarang);
        this.literBarang.set(code, literBarang);
        this.stockBarang.set(code, jumlahStock);

        System.out.println("stock berhasil di update");
    }

    public void removeStock(int code){
        String namaProduk = this.namaBarang.get(code);

        this.namaBarang.remove(code);
        this.hargaBarang.remove(code);
        this.literBarang.remove(code);
        this.stockBarang.remove(code);

        System.out.println(namaProduk + " berhasil di remove dari stock");
    }
}
