package com.dicoding.javafundamental.accessmodifier.package3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nilainya adalah " + Perhitungan.nilai);

        // static variable hanya berjumlah satu, tak  peduli berapapun obyek yang dibuat.
        for (int x = 0 ; x < 5; x++){
            // tes pembuatan objek kelas perhitungan sebanyak 5 kali,
            new Perhitungan();
        }
        System.out.println("Sampai "+Perhitungan.nilai);

        System.out.println("getNilai memiliki nilai " + Perhitungan.getNilai());
    }
}
