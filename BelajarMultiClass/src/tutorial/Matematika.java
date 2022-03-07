package tutorial;

public class Matematika {

    // Overloading Method -> tergantungg kebutuhan

    // Opsi 1
    public static int tambah(int x, int y) {
        return x + y;
    }
    // Opsi 2
    public static double tambah(int x, double y) {
        return (double)x + y;
    }
    // Opsi 3
    public static double tambah(Double x, int y) {
        return (double)x + y;
    }
    // Opsi 4
    public static double tambah(double x, double y) {
        return (double)x + y;
    }
}
