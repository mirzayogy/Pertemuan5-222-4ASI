package model;

public class Mobil {
    private String warna;
    private int tahunProduksi;

    public static String nama;

    public static void halo(){
        System.out.println("Halo");
    }

    public static void nilaiAbjad(double nAkhir){
        String nAbjad = "C";
        if(nAkhir > 80){
            nAbjad = "A";
        } else if (nAkhir > 75){
            nAbjad = "B+";
        } else if (nAkhir > 70){
            nAbjad = "B";
        }

        System.out.println(nAbjad);
    }

    public void maju(){
        System.out.println("model.Mobil tahun " + tahunProduksi + " maju");
    }

    public void cetakInfo(){
        System.out.println("Warnanya : " + warna);
        System.out.println("Tahun Produksi " + tahunProduksi );
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {

        this.warna = warna;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public void setTahunProduksi(int tahunProduksi) {
        if(tahunProduksi < 2000){
            this.tahunProduksi = 2000;
        } else {
            this.tahunProduksi = tahunProduksi;
        }
    }

    public Mobil(){
        this.warna = "Putih";
        this.tahunProduksi = 1900;
    }

    public Mobil(String warna) {
        this.warna = warna;
    }

    public Mobil(String warna, int tahunProduksi) {
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;


    }

    public void simpan(){
        System.out.println("INSERT INTO mobil VALUES ('" + this.warna +"',"+this.tahunProduksi+")");
    }

    public void simpan(String warna){
        System.out.println("INSERT INTO mobil VALUES ('" + warna +"')");
    }

    public void simpan(int tahunProduksi){
        System.out.println("=================");
        System.out.println("INSERT INTO mobil VALUES (" + tahunProduksi +")");

    }

    public void simpan(String merk, int tahunProduksi){

    }
}
