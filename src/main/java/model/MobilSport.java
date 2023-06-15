package model;

public class MobilSport extends Mobil{
    public String merk;

    @Override
    public void simpan(int tahunProduksi){
        super.simpan(tahunProduksi);
        System.out.println("dari Sub class");
        System.out.println("INSERT INTO mobil VALUES (" + tahunProduksi +");");
    }
}
