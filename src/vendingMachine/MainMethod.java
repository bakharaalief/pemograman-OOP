package vendingMachine;

import java.util.ArrayList;

public class MainMethod {
    public static void main(String[] args) {
        //create vending machine
        VendingMachine vending = new VendingMachine();

        //create gopay
        DompetOnline gopay = new DompetOnline(10000);

        //menambahkan stock
        vending.tambahStock("burung", 2000, 40);
        vending.tambahStock("maung", 2000, 20);

        //mencek stock
        vending.listStock();

        //update stock
        vending.updateStock(0, "tokek", 1500, 30);
        vending.listStock();

        //remove barang di stock
        vending.removeStock(0);
        vending.listStock();

        //cek harga barang sebelum bayar
        vending.cekHargaBarang(0, 40);

        //saldo sebelum transaksi
        gopay.cekSaldo();

        //melakukan transaksi dengan uang kurang
        vending.bayarBarang(20000, gopay);

        //mencek saldo
        gopay.cekSaldo();

        //melakukan pembayaran
        vending.bayarBarang(100000, gopay);

        //cek setelah pembayaran
        gopay.cekSaldo();
    }
}
