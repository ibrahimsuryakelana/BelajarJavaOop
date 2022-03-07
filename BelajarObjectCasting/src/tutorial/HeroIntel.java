package tutorial;

public class HeroIntel extends Hero {
    String type ;

    public HeroIntel(String name, double health){
        super(name,health);
        this.type = "intel";
    }

    public void display(){
        System.out.println(this.getName() + " is an " + this.type + " Hero");
    }

    public void castMagic(){
        System.out.println("Mengeluarkan mejik ");
    }
}
