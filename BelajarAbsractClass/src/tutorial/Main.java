package tutorial;

import hero.Hero;
import hero.HeroIntel;
import hero.HeroAgility;

public class Main {
    public static void main(String[] args) {
        
        //Membuat object dari class non-abstract
        HeroIntel hero1 = new HeroIntel("Otong");
        hero1.display();
        
        HeroAgility hero2 = new HeroAgility("Ucup");
        hero2.display();
    }
        // ini tidak bisa karena class hero itu absract class
        // Hero hero3 = new Hero("Bustomi");
        // hero3.display();
}
