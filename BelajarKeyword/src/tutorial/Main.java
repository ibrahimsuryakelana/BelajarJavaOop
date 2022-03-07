package tutorial;

// Visibility
// 1. Public : Jika method atau attribute dalam public secara explisit,maka subclass tidak boleh
//             mengurangi visibility
// 2. Private : Jika method atau attribute dalam private secara explisit, maka subclasspun 
//              tidak dapat mengakses
// 3. Final : method atau attribute dengan final keyword akan diwariskan, tetapi
//            tidak bisa dioveride. Dalam class yang sama bisa dioverload

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Ucup", 100);
        IntelHero hero2 = new IntelHero("Otong", 50);

        hero1.display();
        hero2.display();

        System.out.println(hero1.getHealth());
        System.out.println(hero2.getHealth());

        hero1.SetHealth(120);
        hero1.SetHealth(80);

        hero1.display();
        hero2.display();
        
        hero1.setHealth("reset");
        hero1.display();
    }
}
