package tutorial;

public class HeroAgility extends Hero {
    String type = "Agility";

    HeroAgility(String nama){
        super(nama);   
        System.out.println("Type \t:\t" + this.type);
    }
    @Override
    void display(){
        super.display();
        System.out.println("Type\t: " + this.type);
    }

    void showoff(){
        System.out.println("Saya adalah hero agility");
    }
}
