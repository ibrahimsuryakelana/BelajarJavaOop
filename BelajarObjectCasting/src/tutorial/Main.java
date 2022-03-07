package tutorial;

public class Main {
    public static void main(String[] args) {

        // object dengan class HeroIntel
        HeroIntel hero1 = new HeroIntel("ucup", 100);
        hero1.display();
        hero1.castMagic();

        // up casting
        Hero heroUp = (Hero) hero1;
        heroUp.display();

        // ada field yang hilang
        // System.out.println(heroUp.type); // heroUp sudah dicasting ke class Hero sedangkan diclass Hero tidak ada atribute type
        // heroUp.castMagic();

        // object dengan class Hero
        Hero heroReg = new Hero("otong", 100);
        heroReg.display();

        // Down casting dari Superclass ke subclass, tidak bisa
        // HeroAgility heroDown = (HeroAgility) heroReg;
        // heroDown.display();

        // Berhasil didown casting, dengan syarat bentuk awalnya adalah sama
        HeroIntel hero2 = (HeroIntel) heroUp;
        System.out.println(hero2.type);
        hero2.castMagic();
    }
}
