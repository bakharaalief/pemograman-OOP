package VendingMachine2;

import vendingMachine.DompetOnline;

import java.util.ArrayList;

public class VendingMachine {
    //stock object
    Stock stk = new Stock();

    //decalre
    private double totalHarga;
    private int barangBeli;
    private int codeBarang;

    public void cekHargaBarang(int code, int jumlahBarangBeli){
        codeBarang = code;
        barangBeli = jumlahBarangBeli;
        totalHarga = stk.getHargaBarang(code) * barangBeli;

        System.out.println(
                stk.getNameBarang(code) + " " + stk.getHargaBarang(code) + " | qty : " + jumlahBarangBeli + " = " + totalHarga);
    }

    public void bayarBarang(double uangBayar, DompetOnline dompet){
        int stokBarang = stk.getStockBarang(codeBarang);
        int stockBerkurang = stokBarang - barangBeli;

        //uang cukup dan barang cukup
        if(uangBayar > totalHarga && stockBerkurang >= 0 ){
            if(uangBayar == 10000 || uangBayar == 20000 || uangBayar == 50000 || uangBayar == 100000){
                //kembalian
                double kembalian = uangBayar - totalHarga;
                dompet.isiSaldo(kembalian);

                //stock barang
                stk.setStockBarang(codeBarang,stockBerkurang);

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
