package com.dicoding.javafundamental.propertimetode;

public class Hewan {
    // Konstruktor dengan parameter
    Hewan(int umur) {
        this.umur = umur;
    }

    // Properti atau fields
    double tinggi;
    double berat;
    int umur; // Inisiasi melalui konstruktor

    void lari(){
        System.out.println("Berlari dengan sangat cepat..");
    }
    void jalan(){
        System.out.println("Berjalan dengan pelan..");
    }
    void makan(){
        System.out.println("Makan dengan menggunakan mulut..");
    }

    double getBerat() {
        return berat;
    }
    double getTinggi() {
        return tinggi;
    }
    int getUmur() {
        return umur;
    }
}
