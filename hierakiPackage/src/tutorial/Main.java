package tutorial;

// mengimport Class console;
import terminal.Console;

//mengimport static method dari console.log
import static terminal.Console.log;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("otong");
        player1.show();   

        Console.log("Menampilkan data dari console.log");
        Console.log(player1.getName() + "\n");
        
        log("Menampilkan data dari log saja");
        log(player1.getName());
    }
}

// ini tidak akan bisa, penggunaan private tidak diperkanankan
    // private class Test{

    // }