package tutorial;

public class HeroStrenght extends Hero {
    String type = "Strength";

    HeroStrenght(String nama){
        super(nama);   
    }

    @Override
    void display(){
        super.display();
        System.out.println("Type\t: " + this.type);
    }

    void setType(String type){
        this.type = type;
    }
}
