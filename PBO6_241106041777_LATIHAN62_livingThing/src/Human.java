public class Human implements Activity {
    String name;

    public Human(String name) {
        this.name = name;
    }

    public void walk() {
        System.out.println(name + " sedang berjalan");
    }

    public void breath() {
        System.out.println(name + " Bernafas");
    }

    public void eat() {
        System.out.println(name + " Makan");
    }
}