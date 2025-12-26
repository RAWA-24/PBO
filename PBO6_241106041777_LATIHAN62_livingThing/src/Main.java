// NAMA      : RAYHAN WAFI
// KELAS     : REGULER-C
// NIM       : 241106041777
// DESKRIPSI : Program memanggil class human di class tester dengan meng-set nama masing-masing

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Rizki Adam Kurniawan");

        human.walk();
        human.breath();
        human.eat();
    }
}