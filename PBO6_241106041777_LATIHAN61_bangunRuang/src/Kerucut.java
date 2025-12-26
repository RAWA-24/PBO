public class Kerucut implements BangunRuang {
    double r = 14;
    double t = 9;

    public double hitungVolume() {
        return (1.0/3.0) * 3.14 * r * r * t;
    }
}