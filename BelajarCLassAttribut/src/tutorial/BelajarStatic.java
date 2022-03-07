package tutorial;

import java.util.ArrayList;

class Player{
    private static int numberOfPlayer; 
    private String name;
    private static ArrayList<String> nameList = new ArrayList<String>();

    Player(String name){
        this.name = name;
        Player.numberOfPlayer++;
        Player.nameList.add(this.name);
    }
    void show(){
        System.out.println("Player name : " + this.name);
    }

    // Static Methods
    static void showNumberOfPlayer(){
        System.err.println("Number of player : " + Player.numberOfPlayer);
    }
    public String getNames(){
        return this.name;
    }
}

public class BelajarStatic {
    private static ArrayList<Player> listPlayer = new ArrayList<Player>();

    public static void main(String[] args) {
        Player player1 = new Player("Hadad");
        listPlayer.add(player1);
        Player player2 = new Player("Domo");
        listPlayer.add(player2);
        Player player3 = new Player("Ekal");
        listPlayer.add(player3);
        Player player4 = new Player("Satrio");
        listPlayer.add(player4);

        System.out.println(listPlayer.size());
        player1.showNumberOfPlayer();
        for (int i = 0; i < 10; i++) {
            String s = Integer.toString(i);
            Player newPlayer = new Player("player -"+s);
            listPlayer.add(newPlayer);
        }
        System.out.println(listPlayer.size());
        int count = 0;
        while (listPlayer.size() > count) {
            // Player tempPlayer = listPlayer.get(count);
            // System.out.println(tempPlayer.getNames());
            // count++;
            System.out.println(listPlayer.get(count).getNames());
            count++;
        }

        // System.out.println("Names : " + Player.getNames());
    }
}
