/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingMachine;

/**
 *
 * @author mutiara
 */

import java.util.ArrayList;

public class VendingMachine2 {
    private ArrayList <String> namaBarang = new ArrayList<String>();
    private ArrayList <Integer> hargaBarang = new ArrayList<Integer>();
    private ArrayList <Integer> literBarang = new ArrayList<Integer>();
    private ArrayList <Integer> stockBarang = new ArrayList<Integer>();
    private int totalHarga;
    private int code;
    private int barangBeli;
    
    //konstuktor
    public VendingMachine2() {
    }

    //accessor

    public ArrayList<String> getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(ArrayList<String> namaBarang) {
        this.namaBarang = namaBarang;
    }

    public ArrayList<Integer> getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(ArrayList<Integer> hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public ArrayList<Integer> getStokBarang() {
        return stockBarang;
    }

    public void setStokBarang(ArrayList<Integer> stokBarang) {
        this.stockBarang = stokBarang;
    }
    
    //Daftar Stok
    public void listStockBarang()
    {
        int banyakData = namaBarang.size();
        if(banyakData > 0)
        {
            System.out.println("Code \t| Nama \t\t\t| harga\t\t| Stock");
            System.out.println("-----------------------------------------");
            
            for(int i = 0; i < banyakData; i++ )
            {
             System.out.println(i + " \t\t| " + namaBarang.get(i) + " \t\t| " + hargaBarang.get(i) + " \t| " + stockBarang.get(i));
            } 
            System.out.println("-----------------------------------------");
            
            
        }else
        {
        System.out.println("Maaf, Stoknya masih kosong");
        }  
    } 
    
    //Total barang
    public int totalBarang()
    {
        int banyakData = namaBarang.size();
        int seluruhBarang = 0;

        for(int i = 0; i < banyakData; i++ )
        {
            seluruhBarang += stockBarang.get(i);
        }

        return seluruhBarang;
    }
    
    //Total liter
    public int totalLiter()
    {
        int banyakData = namaBarang.size();
        int seluruhLiter = 0;

        for(int i = 0; i < banyakData; i++ )
        {
            seluruhLiter += literBarang.get(i) * stockBarang.get(i);
        }

        return seluruhLiter;
    }
    
    public void tambahStock(String namaBarang, int hargaBarang, int literBarang, int jumlahStock)
      {
        if( totalBarang() +jumlahStock <= 50 && totalLiter() + (literBarang*jumlahStock) <= 1000)
        {
            this.namaBarang.add(namaBarang);
            this.hargaBarang.add(hargaBarang);
            this.literBarang.add(literBarang);
            this.stockBarang.add(jumlahStock);

            System.out.println(namaBarang + " Berhasil ditambah ke Stock ");
        }

        else
        {
            System.out.println(namaBarang + " Maaf gagal ditambah ke Stock karena Penuh ");
        }

    }
   public void updateStock(int code, String namaBarang, int hargaBarang, int literBarang, int jumlahStock){
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
   public void cekHargaBarang(int codeBarang, int jumlahBarangBeli){
        code = codeBarang;
        barangBeli = jumlahBarangBeli;
        totalHarga = hargaBarang.get(code) * jumlahBarangBeli;

        System.out.println(
        namaBarang.get(code) + " " + hargaBarang.get(code) + " | qty : " + jumlahBarangBeli + " = " + totalHarga);
    }

    public void bayarBarang(double uangBayar){
        int stokBarang = stockBarang.get(code);
        int stockBerkurang = stokBarang - barangBeli;

        //uang cukup dan barang cukup
        if(uangBayar > totalHarga && stockBerkurang >= 0 ){
            if(uangBayar == 10000 || uangBayar == 20000 || uangBayar == 50000 || uangBayar == 100000){
                //kembalian
                double kembalian = uangBayar - totalHarga;
//                uang.isiSaldo(kembalian);

                //stock barang
                stockBarang.set(code, stockBerkurang);

                System.out.println("Trimakasih, pembayaran berhasil, kembalian anda sudah masuk ke saldo");
            }

            else{
                System.out.println("Masukkan uang 10.000, 20.000, 50.000, dan 100.000");
            }

        }

        else if(uangBayar > totalHarga && stockBerkurang < 0){
            System.out.println("Maaf stock barang kurang");
        }

        //uang bayar kurang
        else
        {
            System.out.println("Maaf uang anda kurang untuk melakukan transaksi ");
        }
    }
}