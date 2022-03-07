package tutorial;

import terminal.Console;

//Visibility default
class Player {
    private String name;

    Player(String name){
        this.name = name;
    }

    void show(){
        // System.out.println("Player name : " + this.name);
        Console.log("Player name : " + this.name);
    }

    String getName(){
        return this.name;
    }
}
