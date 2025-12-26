// NAMA      : Rayhan Wafi
// KELAS     : Reguler-C
// NIM       : 241106041777
// DESKRIPSI : Program untuk menghitung volume bangun ruang menggunakan konsep abstraksi

public class Main {
    public static void main(String[] args) {
        BangunRuang Kerucut = new Kerucut();
        BangunRuang Tabung = new Tabung();
        BangunRuang Bola = new Bola();

        System.out.println("Volume Kerucut = " + Kerucut.hitungVolume());
        System.out.println("Volume Tabung = " + Tabung.hitungVolume());
        System.out.println("Volume Bola = " + Bola.hitungVolume());
    }
}
