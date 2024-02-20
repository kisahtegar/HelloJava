package com.dicoding.javafundamental.interfaces;

/**
 * Interface harus dapat digunakan ke kelas lain. Cara untuk mengimplementasi interface yaitu menggunakan keyword
 * implements pada kelas yang mengimplementasikannya.
 *
 * Dari latihan sebelumnya kita membuat interface Hewan. Kemudian kita membuat kelas Kucing yang menerapkan interface
 * tersebut. Maka tiap metode yang berada pada interface harus diimplementasikan. Interface terlihat sebagai suatu
 * aturan atau kontrak bagi kelas yang mengimplementasikannya.
 */
public abstract class Kucing implements Hewan {
    @Override
    public void makan() {

    }
}