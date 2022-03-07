package tutorial;

public class HeroIntel extends Hero {
    String type = "Intel";

    HeroIntel(String nama){
        super(nama);   
        System.out.println("Type \t:\t" + this.type);
    }
    @Override
    void display(){
        super.display();
        System.out.println("Type\t: " + this.type);
    }
}
