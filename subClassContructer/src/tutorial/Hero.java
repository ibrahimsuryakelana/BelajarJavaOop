package tutorial;

public class Hero {
    //Atribut
    String name;
    double defencePower;

    //Constructer
    Hero(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }

    Hero(String name){
        this.name = name;
    }
    //Method
    void display(){
        System.out.println("Hero Name : " + this.name);
    }


}
