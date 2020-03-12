package vendingMachine;

import java.util.ArrayList;

public class VendingMachine {
    //declare
    private ArrayList<String> namaBarang = new ArrayList<>();
    private ArrayList<Double> hargaBarang = new ArrayList<>();
    private ArrayList<Integer> stockBarang = new ArrayList<>();
    private double totalHarga;

    public void listStock(){
        //mencari banyak data
        int banyakData = namaBarang.size();

        //jika sudah terdapat data
        if(banyakData > 0){
            System.out.println("Code \t| Nama \t\t\t| harga\t\t| Stock");
            System.out.println("-----------------------------------------");


            for(int i = 0; i < banyakData; i++ ){
                System.out.println(
                        i + " \t\t| " + namaBarang.get(i) + " \t\t| " + hargaBarang.get(i) + " \t| " + stockBarang.get(i)
                );
            }
        }

        else{
            System.out.println("Saat ini stock masih kosong");
        }
    }

    public void tambahStock(String namaBarang, double hargaBarang, int jumlahStock){
        this.namaBarang.add(namaBarang);
        this.hargaBarang.add(hargaBarang);
        this.stockBarang.add(jumlahStock);

        System.out.println(namaBarang + " Berhasil ditambah ke Stock ");
    }

    public void updateStock(int code, String namaBarang, double hargaBarang, int jumlahStock){
        this.namaBarang.set(code, namaBarang);
        this.hargaBarang.set(code, hargaBarang);
        this.stockBarang.set(code, jumlahStock);

        System.out.println("stock berhasil di update");
    }

    public void removeStock(int code){
        String namaProduk = this.namaBarang.get(code);

        this.namaBarang.remove(code);
        this.hargaBarang.remove(code);
        this.stockBarang.remove(code);

        System.out.println(namaProduk + " berhasil di remove dari stock");
    }

    public String getNamaBarang(int code){
        return this.namaBarang.get(code);
    }

    public Double getHargaBarang(int code){
        return this.hargaBarang.get(code);
    }

    public int getStockBarang(int code){
        return this.stockBarang.get(code);
    }

    public void cekHargaBarang(int code, int jumlahBarangBeli){
        totalHarga = getHargaBarang(code) * jumlahBarangBeli;

        System.out.println(
                getNamaBarang(code) + " " + getHargaBarang(code) + " | qty : " + jumlahBarangBeli + " = " + totalHarga);
    }

    public void bayarBarang(double uangBayar, DompetOnline dompet){
        if(uangBayar > totalHarga){
            double kembalian = uangBayar - totalHarga;
            dompet.isiSaldo(kembalian);
            System.out.println("Terima kasih sudah melakukan pembayaran :) kembalian anda masuk ke saldo");
        }
        else{
            System.out.println("Maaf uang anda kurang untuk melakukan transaksi ");
        }

    }
}
