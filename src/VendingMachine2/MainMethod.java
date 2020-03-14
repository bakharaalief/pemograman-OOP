package VendingMachine2;

public class MainMethod {
    public static void main(String[] args) {
        //create Object
        Stock stok = new Stock();
        VendingMachine vendingMachine = new VendingMachine();

        //tambah barang
        stok.tambahStock("ayam", 2000, 20,4);
        stok.tambahStock("ikan", 3000, 10,5);

        //cek list barang
        stok.listStock();

        //cekHargaBarang
        vendingMachine.cekHargaBarang(0,10);
    }
}
