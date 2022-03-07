package com.tutorial;

class Kelas{
    String nama_siswa;
    Integer tingkat ;

    Kelas(String inputNama,Integer inputTingkat){
        nama_siswa = inputNama;
        tingkat = inputTingkat;
    }
}
class Jurusan{
//Data Member
    String nama_siswa;
    String nama_jurusan;
    Integer tingkat;
//Constructor
    Jurusan(String inputNama, String inputJurusan, Integer inputTingkat){
        nama_siswa = inputNama;
        nama_jurusan = inputJurusan;
        tingkat = inputTingkat;

        System.out.println(nama_siswa);
        System.out.println(nama_jurusan);
        System.out.println(tingkat);
    }
}

public class Constructor {
    public static void main(String[] args) {
    //System.out dibawah
        Kelas kelas = new Kelas("ibra", 31);
        System.out.println(kelas.nama_siswa);
        System.out.println(kelas.tingkat);
    //System.out diatas
        new Jurusan("Surya", "RPL", 11);
    }
}
