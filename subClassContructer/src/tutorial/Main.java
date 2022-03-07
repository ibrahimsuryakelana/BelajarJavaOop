package tutorial;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("superClass", 10);
        HeroStrength hero2 = new HeroStrength("subClass",9);
        hero1.display();
        hero2.display();
    }
}
