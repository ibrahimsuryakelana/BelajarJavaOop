package tutorial;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("otong");
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player("Mae");

        player1.show();
        player2.show();
        player3.show();
        player4.show();

        double a = Matematika.tambah(1, 19.8);
        System.out.println(a);

        int b = Matematika.tambah(1, 2);
        System.out.println(b);

        double c = Matematika.tambah(0.1, 2);
        System.out.println(c);

        double d = Matematika.tambah(0.1, 1.2);
        System.out.println(d);

    }
}
