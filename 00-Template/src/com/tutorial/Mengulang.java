package com.tutorial;

class Siswa {
    Integer nis;
    String nama;
    String alamat;

    Rombel rombel;

    Siswa(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
    }
    void setRombel(Rombel rombel){
        this.rombel = rombel;
    }
    void display(){
        System.out.println("Nama Saya " + this.nama + ", Alamat Saya " + this.alamat);
        this.rombel.display();;
    }
}

class Rombel{
    String tingkat;
    String jurusan;
    
    Rombel(String tingkat, String jurusan){
        this.tingkat = tingkat;
        this.jurusan = jurusan;
    }
    void display(){
        System.out.println("Saya Kelas : " + this.tingkat + ", Jurusan : " + this.jurusan);
    }
}

public class Mengulang {
    public static void main(String[] args) {
     Siswa siswa1 = new Siswa("Iba", "cinagara");
     Rombel rombel = new Rombel("10", "RPL");
     siswa1.setRombel(rombel);
     siswa1.display();
    }
}
