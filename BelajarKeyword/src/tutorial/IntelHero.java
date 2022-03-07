package tutorial;

// Public ini akan terbuka untuk semuanya
public class IntelHero extends Hero{
    // Memanggil constructor dari super class
    IntelHero(String name, double health){
        super(name, health);
        // System.out.println(this.health); -> ini tidak bisa diakses karena atributenya private
    }

    // visibility harus sama dengan superclass
    public void display(){
        System.out.println(this.name + " mempunyai banyak " + this.getHealth());
    } 

    // overide final setter, tidak bisa dilakukan
    // void setHealth(double newHealth){
    //     System.out.println("Mencoba memasukan health : " + newHealth);
    // }

    // ini bisa dilakukan
    public void setHealth(String newHealth){
        System.out.println("Mencoba memasukan health : " + newHealth);
    }

}
