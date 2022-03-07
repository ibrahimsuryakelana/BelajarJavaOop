package com.tutorial;

class Player{
    String name;
    double health;
    int level;
    // object member
    Weapon weapon;
    Armor armor;

    Player(String name, double health){
        this.name = name;
        this.health = health;
    }

    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor bajuBesi){
        this.armor = bajuBesi;
    }

    void display(){
        System.out.println("\nName   : " + this.name);
        System.out.println("Health : " + this.health + " hp");
        this.weapon.display();
        this.armor.display();
    }
}

class Weapon{
    double attactPower;
    String name;

    Weapon(String name, double attactPower){
        this.name = name;
        this.attactPower =attactPower;
    }

    void display(){
        System.out.println("Weapon : " + this.name + " ,Attact : " + this.attactPower);
    }
}

class Armor{
    String name;
    double defencePower;

    Armor(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }

    void display(){
        System.out.println("Armor : " + this.name + " ,Defence Power : " + this.defencePower);
    }
}

public class Ujian {
    public static void main(String[] args) {
        //Membuat object player
        Player player1 = new Player("iba", 100);
        Player player2 = new Player("surya", 50);
        
        //Membuat object weapon
        Weapon pedang = new Weapon("pedang", 16);
        Weapon ketepel = new Weapon("ketapel", 2);

        //Membuat object armor
        Armor bajuBesi = new Armor("baju besi", 10);
        Armor kaos = new Armor("kaos", 1);

        //cetak player1
        player1.equipWeapon(pedang);
        player1.equipArmor(bajuBesi);
        player1.display();

        //cetak player2
        player2.equipWeapon(ketepel);
        player2.equipArmor(kaos);
        player2.display();

    }
}
