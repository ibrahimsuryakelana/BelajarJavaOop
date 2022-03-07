package com.tutorial;

class Pemain{
    String name; //Default(tanpa public/ private), dia akan bisa dibaca dan ditulis dari luar class
    public int exp; //Public, dia akan bisa dibaca dan ditulis dari luar class
    private int health;///Private, dia hanya akan bisa dibaca dan ditulis didalam class saja


    Pemain(String name, int exp, int health){
        this.name = name;
        this.exp = exp;
        this.health = health;
    }

    //Methods

    void display(){
        tambahExp();
        System.out.println("Name :" + this.name);
        System.out.println("Exp :" + this.exp);
        System.out.println("Health :" + this.health);
    }

    public void setName(String name){
        this.name = name;
    }

    private void tambahExp(){
        this.exp += 100;
    }
}

public class PublicAndPrivate {
    public static void main(String[] args) {
        
        Pemain player1 = new Pemain("marni",0,100);

        //Default
        System.out.println("--Default--");
        System.out.println(player1.name);//Membaca data
        player1.name = "puad";//Menulis data
        System.out.println(player1.name);//membaca data
        
        //Public
        System.out.println("\n--Public--");
        System.out.println(player1.exp);//Membaca data
        player1.exp = 50;//Menulis data
        System.out.println(player1.exp);//membaca data

        //Private {Tidak bisa diakses diclass lain karena private}
            //  System.out.println("\n--Private--");
            //  System.out.println(player1.health);//Membaca data
            //  player1.health = 50;//Menulis data
            //  System.out.println(player1.health);//membaca data

        //Methods

        //Default
        System.out.println("\n--Method Default");
        player1.display();

        //public
        System.out.println("\n--Method Public--");
        player1.setName("jaja");
        player1.display();

        //private
            // System.out.println("\n--Method Private--");
            // player1.tambahExp();
            // player1.display();
    }
}
