// NAMA      : Rayhan Wafi
// NIM       : 241106041777
// KELAS     : Reguler-C

public class Main {
    public static void main(String[] args) {

        Koordinat k1 = new Koordinat(2, 10, 5, 7);
        System.out.println(
                "Garis yang melalui titik (" + k1.getX1() + "," + k1.getY1() +
                        ") dan (" + k1.getX2() + "," + k1.getY2() +
                        ") memiliki gradien sebesar " + k1.hitungGradien()
        );

        Koordinat k2 = new Koordinat(5, 1, 3, 12);
        System.out.println(
                "Garis yang melalui titik (" + k2.getX1() + "," + k2.getY1() +
                        ") dan (" + k2.getX2() + "," + k2.getY2() +
                        ") memiliki gradien sebesar " + k2.hitungGradien()
        );
    }
}