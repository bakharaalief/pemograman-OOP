package vendingMachine;

import java.util.ArrayList;

public class MainMethod {
    public static void main(String[] args) {
        //create vending machine
        VendingMachine vending = new VendingMachine();

        //create gopay
        DompetOnline gopay = new DompetOnline(10000);

        //menambahkan stock
        vending.tambahStock("burung", 2000, 10,40);
        vending.tambahStock("maung", 2000, 10, 20);

        //mencek stock
        vending.listStock();

        //cek harga
        vending.cekHargaBarang(0,50);

        //bayar barang
        vending.bayarBarang(200000,gopay);

        //mencek stock
        vending.listStock();
    }
}
