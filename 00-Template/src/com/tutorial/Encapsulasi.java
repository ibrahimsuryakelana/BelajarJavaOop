package com.tutorial;

class Data{
    public int intPublic;
    private int intPrivate;

    public Data(){
        this.intPublic = 10;
        this.intPrivate = 10;
    }

    //Getter
    public int getIntPrivet(){
        return this.intPrivate;
    }

    //Setter
    public void setIntPrivate(int intPrivate){
        this.intPrivate = intPrivate;
    }
}

class Lingkaran{
    private double diameter;

    Lingkaran(double diameter){
        this.diameter = diameter;
    }

    public void setJari2(double jari2){
        this.diameter = jari2*2;
    }

    public double getJari2(){
        return this.diameter/2;
    }
}

public class Encapsulasi {
    public static void main(String[] args) {
        Data object = new Data();

        //public -- Read And Write
        object.intPublic = 5; //Write
        System.out.println("Public : " + object.intPublic); //read

        //private(Getter) -- Read only
        int get = object.getIntPrivet();
        System.out.println("Getter" + get);

        //private(Setter) -- Write only
       object.setIntPrivate(100  );

       //Menggabungkann Setter dan Getter
       Lingkaran ling = new Lingkaran(5);
       System.out.println(ling.getJari2()); 
       ling.setJari2(10);
       System.out.println(ling.getJari2()); 
 
    }   
}
