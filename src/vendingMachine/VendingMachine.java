package vendingMachine;

import java.util.ArrayList;

public class VendingMachine {
    //declare
    private ArrayList<String> namaBarang = new ArrayList<>();
    private ArrayList<Double> hargaBarang = new ArrayList<>();
    private ArrayList<Integer> literBarang = new ArrayList<>();
    private ArrayList<Integer> stockBarang = new ArrayList<>();
    private double totalHarga;
    private int barangBeli;
    private int codeBarang;

//    //getNamaBarang
//    public String getNamaBarang(int code){
//        return this.namaBarang.get(code);
//    }
//
//    //getHargaBarang
//    public Double getHargaBarang(int code){
//        return this.hargaBarang.get(code);
//    }
//
//    //getStockBarang
//    public int getStockBarang(int code){
//        return this.stockBarang.get(code);
//    }
//
//    //getLiterBarang
//    public int getLiterBarang(int code){
//        return this.literBarang.get(code);
//    }

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
        if( totalBarang() - jumlahStock < 50 && totalLiter() - literBarang*jumlahStock < 1000){
            this.namaBarang.add(namaBarang);
            this.hargaBarang.add(hargaBarang);
            this.literBarang.add(literBarang);
            this.stockBarang.add(jumlahStock);

            System.out.println(namaBarang + " Berhasil ditambah ke Stock ");
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

    public void cekHargaBarang(int code, int jumlahBarangBeli){
        codeBarang = code;
        barangBeli = jumlahBarangBeli;
        totalHarga = hargaBarang.get(code) * jumlahBarangBeli;

        System.out.println(
                namaBarang.get(code) + " " + hargaBarang.get(code) + " | qty : " + jumlahBarangBeli + " = " + totalHarga);
    }

    public void bayarBarang(double uangBayar, DompetOnline dompet){
        int stokBarang = stockBarang.get(codeBarang);
        int stockBerkurang = stokBarang - barangBeli;

        //uang cukup dan barang cukup
        if(uangBayar > totalHarga && stockBerkurang >= 0 ){
            if(uangBayar == 10000 || uangBayar == 20000 || uangBayar == 50000 || uangBayar == 100000){
                //kembalian
                double kembalian = uangBayar - totalHarga;
                dompet.isiSaldo(kembalian);

                //stock barang
                stockBarang.set(codeBarang, stockBerkurang);

                System.out.println("Terima kasih sudah melakukan pembayaran :) kembalian anda masuk ke saldo");
            }

            else{
                System.out.println("Masukkan uang 10.000, 20.000, 50.000, dan 100.000");
            }

        }

        else if(uangBayar > totalHarga && stockBerkurang < 0){
            System.out.println("Maaf stock barang kurang");
        }

        //uang bayar kurang
        else{
            System.out.println("Maaf uang anda kurang untuk melakukan transaksi ");
        }

    }
}
