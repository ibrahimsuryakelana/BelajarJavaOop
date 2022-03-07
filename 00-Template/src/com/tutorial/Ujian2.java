package com.tutorial;

class Peserta{
    private String name;
    private int baseHealth;
    private int baseAttact;
    private int level;
    private int intcrementHealth;
    private int intcrementAttact;
    

    // Ini adalah object member
    private Pelingdung pelingdung;
    private Senjata senjata;
    
    public Peserta(String name){
        this.name = name;
        this.baseHealth = 100;
        this.baseAttact = 100;
        this.level =1;
        this.intcrementHealth = 20;
        this.intcrementAttact = 20;
    }

    public void display(){
        System.out.println("Peserta\t\t: " +this.name);
        System.out.println("Level\t\t: " + this.level);
        System.out.println("Pelindung\t: " + this.getNamePelindung());
        System.out.println("Senjata\t\t: " + this.getNameSenjata());
        System.out.println("Health\t\t: " +this.maxHealth());
        System.out.println("Attact\t\t: " +this.getAttactPower() + "\n");
    }

    public void levelUp(){
        this.level++;
    }

    public void setPelindung(Pelingdung pelingdung){
        this.pelingdung = pelingdung;
    }

    public void setSenjata(Senjata senjata){
        this.senjata =senjata;
    }

    public int maxHealth(){
        return this.baseHealth + this.level*this.intcrementHealth + this.pelingdung.getAddHealth();
    }

    public int getAttactPower(){
        return this.baseAttact + this.level*intcrementAttact + this.senjata.getAttact();        
    }
    public String getNamePelindung(){
        return this.pelingdung.getName();
    }
    public String getNameSenjata(){
        return this.senjata.getSenjata();
    }
}

class Senjata{
    private String name;
    private int attact;

    public Senjata(String name, int attact){
        this.name = name;
        this.attact = attact;
    }
    public int getAttact(){
        return this.attact;
    }
    public String getSenjata(){
        return this.name;
    }
}

class Pelingdung{
    private String name;
    private int strengh;
    private int health;

    public Pelingdung(String name, int strengh, int health){
        this.name = name;
        this.strengh = strengh;
        this.health = health;
    }

    public int getAddHealth(){
        return this.strengh*10 + this.health;
    }
    public String getName(){
        return this.name ;
    }
}

public class Ujian2 {
    public static void main(String[] args) {
        Peserta peserta1 = new Peserta("marni");
        Pelingdung pelingdung1 = new Pelingdung("Baju besi",5, 100);
        Senjata senjata1 = new Senjata("pedang", 10);
        peserta1.setPelindung(pelingdung1);
        peserta1.setSenjata(senjata1);

        Peserta peserta2 = new Peserta("Isabela");
        Pelingdung pelingdung2 = new Pelingdung("Gaun",1, 100);
        Senjata senjata2 =new Senjata("pecutt",40 );
        peserta2.setPelindung(pelingdung2);
        peserta2.setSenjata(senjata2);

        peserta1.display();
        peserta2.display();

        peserta1.levelUp();
        peserta2.levelUp();
        
        peserta1.display();
        peserta2.display();

    }
}
