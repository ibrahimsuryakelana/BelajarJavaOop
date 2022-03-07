package tutorial;

public class Hero {
    String nama;

    Hero(String nama){
        this.nama = nama;
    }

    void display(){
        System.out.println("\nname \t: " + this.nama);
    }

    void attack(Hero enemy){
        System.out.println(this.nama + " Menyerang" );
    }
}
