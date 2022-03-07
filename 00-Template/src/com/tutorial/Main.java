package com.tutorial;
 

//Membuat class sebagai wadah
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;
    Double ipk;
    int umur;
}



public class Main {
    public static void main(String[] args) throws Exception {

//Ini print manual tanpa parameter
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Ibrahim";
        mahasiswa1.NIM = "11800371";
        mahasiswa1.jurusan = "Rekayasa Perangkat Lunak";
        mahasiswa1.ipk = 4.0;
        mahasiswa1.umur = 19;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.ipk);
        System.out.println(mahasiswa1.umur);
    }
}
