package tutorial;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("ucup");
        HeroStrenght hero2 = new HeroStrenght("otong");
        hero1.display();
        hero2.display();
        hero1.attack(hero2);

        //Polymorphic
        Hero hero3 = new HeroStrenght("Maria");
        hero3.display();

        HeroAgility hero4 = new HeroAgility("Maria");
        
        hero4.display();
        hero4.showoff();

        // Tidak bisa 
        // HeroIntel hero4 = new Hero("mahmud");
        // hero4.display();

        // Array List
        System.out.println("\n--Array List--");
        Hero[] kumpulanHero = new Hero[4];
        kumpulanHero[0] = hero1;
        kumpulanHero[1] = hero2;
        kumpulanHero[2] = hero3;
        kumpulanHero[3] = hero4; // casting

        kumpulanHero[0].display();
        kumpulanHero[1].display();
        kumpulanHero[2].display();

        // Method calss
        // kumpulanHero[3].showoff(); // ini tidak bisa karena ini sudah dimasukan kedalam class Hero dan disana tidak ada method show off

        // Aplikasi
        // hero1.attack(hero2);
        // hero2.attack(hero3);
        // hero1.attack(hero4);
    }
}
