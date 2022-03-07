package com.tutorial;

class Kantor{
    //data member
    String nama_kantor;
    String alamat;

    //constructor
    Kantor(String nama_kantor, String alamat){
        this.nama_kantor = nama_kantor;
        this.alamat = alamat;
        System.out.println(nama_kantor);
        System.out.println(alamat);
    }

    // method tampa return dan tanpa parameter
    void show(){
        System.err.println("Nama Kantor : " + this.nama_kantor);
        System.out.println("Alamat      : " + this.alamat);
    } 

    //method tampa return tapi memakai parameter
    void setNamaKantor(String nama){
        this.nama_kantor = nama;
    } 
    
    //method memakai return dan tampa parameter
    String getNamaKantor(){
        return this.nama_kantor;
    }
    String getAlamat(){
        return this.alamat;
    }

    //method memakai return dan memakai parameter
    String sayHi(String message){
        return message + " kami dari kantor " + this.nama_kantor;
    }
}

class Hrd{
    String nama_hr;

    Hrd(String nama_hr){
        this.nama_hr = nama_hr;
    }
}

public class Method {
    public static void main(String[] args) {
        Kantor kantor = new Kantor("Indicator", "Permata Hijau");
            
        //Run Method show    
        kantor.show();

    System.out.println("------------");
        
        //Run method setNama
        kantor.setNamaKantor("eBdesk");
        kantor.show();

    System.out.println("------------");
        //Run method getNama
        System.out.println(kantor.getNamaKantor());

    System.out.println("-------------");
        //run method sayHi
        String data = kantor.sayHi("Hay");
        System.out.println(data);

    System.out.println("--------------");
        Hrd hr = new Hrd("Ibra");
        System.out.println(hr);
    }    
}
