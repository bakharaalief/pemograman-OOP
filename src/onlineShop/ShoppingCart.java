package onlineShop;

import java.util.ArrayList;

public class ShoppingCart {

    //deklarasi class
    private ArrayList<Produk>produkCart = new ArrayList<>();
    private int jumlahProduk;
    private String idTransaksi;

    //constructor
    public ShoppingCart(String namaUser){
        this.idTransaksi = namaUser;
    }

    public void cart(Produk p){
        produkCart.add(p);
    }

    public void bayar(Transaksi tr){
        jumlahProduk = produkCart.size();
        int hargaTotal = 0;

        for(int i = 0; i < jumlahProduk; i++){
            int harga = produkCart.get(i).harga;
            hargaTotal += harga;

            //product info
            produkCart.get(i).infoProduk();
        }

        tr.catatTransaksi(idTransaksi, hargaTotal);
    }


}
