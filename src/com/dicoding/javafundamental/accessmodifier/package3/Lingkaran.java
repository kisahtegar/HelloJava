package com.dicoding.javafundamental.accessmodifier.package3;

import java.io.Serializable;

// final class cannot be used for sub-class
final public class Lingkaran {
    // static variable is immutable, cannot be changed.
    static final double PI = 3.141;

    int jari = 7;

    // final method can't be override, method cannot be changed
    final double getLuas() {
        return PI * (jari * jari);
    }

    /**
     * Synchronized modifier digunakan untuk membatasi akses ke suatu variable/methods yang hanya boleh dilakukan oleh
     * satu thread. Ketika ada 2 thread yang ingin mengakses synchronized variable/methods, maka prosesnya akan
     * dilakukan secara serial (bergantian).
     */
    public synchronized void showData() {

    }
}

/**
 * Transient memiliki hubungan dengan proses serialisasi (serializing). Serialisasi adalah proses konversi suatu objek
 * menjadi byte agar dapat ditransmisikan.
 *
 * Variabel yang dideklarasikan sebagai transient maka akan tidak dijaga nilainya di dalam proses serialisasi. Contoh
 * penggunaannya adalah seperti ini.
 */
class Test implements Serializable {

    // Variabel ini tidak akan dijaga nilainya
    transient int nilaiA;

    // Variabel ini akan dijaga nilainya
    double nilaiB;
    String nilaiC;

}
