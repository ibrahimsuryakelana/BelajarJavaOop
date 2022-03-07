package com.tutorial;

class Buku{
    String judul;
    String penulis;

    Buku(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }
    void display(){
        System.out.println("\nJudul : " +this.judul);
        System.out.println("Penulis : " +this.penulis);

    }
}

public class ReferencePadaObject {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Tutorial masak", "ibu maemunah");
        buku1.display();

//Menampilkan address
        String addressBuku1 = Integer.toHexString(System.identityHashCode(buku1));
        System.out.println(addressBuku1);
    }
}
