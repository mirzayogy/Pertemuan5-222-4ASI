import model.Mobil;

public class Main {
    public static void main(String[] args) {
//        Mobil mobilku = new Mobil();
//
//        mobilku.setWarna("Merah");
//        mobilku.setTahunProduksi(2006);
//        mobilku.cetakInfo();
//
//        Mobil mbl = new Mobil();
//        mbl.setWarna("Hijau");
//        mbl.setTahunProduksi(2023);
//
//        mbl.cetakInfo();
//
//        mbl.getWarna();
//        mbl.setWarna("Putih");
//        mbl.getWarna();
//
//        Mobil.halo();
//        Mobil.nama = "A";
        //NamaClass namaObject = new Konstruktor()
        Mobil tesKosong = new Mobil();
        String a;
        int b;

        System.out.println(tesKosong.getWarna());
        System.out.println(tesKosong.getTahunProduksi());

        Mobil tesBiru = new Mobil("Biru");

        System.out.println(tesBiru.getWarna());
        System.out.println(tesBiru.getTahunProduksi());

        Mobil tesHijau = new Mobil("Hijau",2023);

        System.out.println(tesHijau.getWarna());
        System.out.println(tesHijau.getTahunProduksi());

        MyFrame mf = new MyFrame();
        mf.setVisible(true);
    }
}
