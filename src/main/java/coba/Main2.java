package coba;


import model.Mobil;

public class Main2 {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.setWarna("Putih");
        mobil.setTahunProduksi(1);
        System.out.println(mobil.getWarna());

        Mobil.halo();
        Mobil.nilaiAbjad(60);
        Mobil.nilaiAbjad(90);
        Mobil.nilaiAbjad(73);
    }
}
