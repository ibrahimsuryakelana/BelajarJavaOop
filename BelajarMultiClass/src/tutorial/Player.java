package tutorial;

public class Player {
    private String name;
    private static int jumlahPlayer;

    // Overloading Constructor

    // opsi 1
    Player(String name){
        Player.jumlahPlayer++;
        this.name = name + jumlahPlayer;
    }
    // opsi 2
    Player(){
        Player.jumlahPlayer++;
        this.name = "player" + jumlahPlayer;
    }
    void show(){
        System.out.println("Player name : " + this.name );
    }
}
