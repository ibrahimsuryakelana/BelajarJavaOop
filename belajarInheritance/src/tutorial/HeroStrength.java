package tutorial;

//SubClass

// this.name akan mengakses atribut namenya kalau ada dikelas ini, jika tidak ada maka
// akan mengakses atribut name dari superclass.

//super.name akan selalu mengakses superclass
public class HeroStrength extends Hero {
    String name = "ClassStrength";

    // Overriding Methods
    void display(){
        System.out.println("ini adalah : " + this.name);//this -> ini akan mengakses diclass ini sendiri
        this.dummyMethod();
    }

    void displaySuper(){
        System.out.println("ini adalah :" + super.name);// super -> ini akan mengakses langsung ke SuperClass 
        super.dummyMethod();
    }

    void dummyMethod(){
        System.out.println("Metho ini ada di SubClass");
    }
    
}
