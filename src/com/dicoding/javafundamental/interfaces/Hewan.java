package com.dicoding.javafundamental.interfaces;

/**
 * interface sangat mirip dengan kelas, tapi tanpa atribut kelas dan memiliki metode yang dideklarasikan tanpa isi.
 * Deklarasi metode pada sebuah interface dapat diimplementasikan oleh kelas lain.
 */
public interface Hewan {
    // Konstanta di kode Java biasanya ditulis dengan huruf besar semuanya dan diberi pemisah underscore jika lebih dari
    // 1 kata. Hal ini tertuang di java coding convention bagian Constants.
    String respirasi = "oksigen";

    void makan();
}
