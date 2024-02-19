package com.dicoding.javafundamental.tipedata;

import com.dicoding.javafundamental.basic.musik.Gitar;

public class TipeData {
    // 1) Byte
    // Tipe data integer 8 bit yang digunakan untuk menampung angka dalam range yang kecil. Nilai minimum dan maksimum
    // dari tipe data ini adalah -128, dan 127. Tipe data byte memiliki nilai default 0. Ia digunakan untuk menghemat
    // ruang dalam array yang besar, terutama pada bilangan bulat, karena 1 (satu) byte 4 (empat) kali lebih kecil dari
    // tipe data int.
    byte value = 10;
    byte anotherValue = -10;

    // 2) Short
    // Merupakan tipe data integer 16 bit yang digunakan untuk menampung angka dalam range menengah, yaitu antara
    // -32,768 sampai 32,767. Sama seperti tipe sebelumnya, nilai default-nya 0. Ia bisa digunakan untuk menghemat
    // memori seperti tipe data byte namun hanya 2 (dua) kali lebih kecil dari tipe data int.
    short valueShort = 15000;
    short anotherValueShort = -20000;

    // 3) Int
    // Merupakan tipe data integer 32 bit yang digunakan untuk menyimpan angka dalam range cukup besar, yakni antara
    // -2,147,483,648 sampai 2,147,483,647 dengan nilai default 0. Jika kita tidak memperhatikan penggunaan memori,
    // tipe data inilah yang biasanya dipakai.
    int valueInt = 150000;
    int anotherValueInt = -200000;

    // 4) Long
    // Merupakan tipe data integer yang lebih besar jika dibandingkan dengan tipe data int. Ukurannya 64 bit dan bisa
    // digunakan untuk menyimpan angka dengan range antara -9,223,372,036,854,775,808 sampai 9,223,372,036,854,775,807.
    // Tipe data long memiliki nilai default 0L.
    long valueLong = 150000L;
    long anotherValueLong = -200000L;

    // 5) Float
    // Merupakan sebuah tipe data yang bisa digunakan untuk menampung angka desimal. Nilai default-nya 0.0f.
    float valueFloat = 3.5f;

    // 6) Double
    // Merupakan sebuah tipe data yang mirip seperti tipe data float, namun memiliki kapasitas yang lebih besar. Nilai
    // default-nya 0.0d.
    double valueDouble = 5.0;

    // 7) Boolean
    // Merupakan sebuah tipe data yang memiliki 2 (dua) macam nilai, yaitu true dan false. Nilai default-nya false.
    boolean valueBoolean = true;
    boolean anotherValueBoolean = false;

    // 8) Char
    // Merupakan sebuah tipe data yang bisa digunakan untuk menampung karakter. Nilai karakter tersebut dibungkus di
    // dalam tanda ' '.
    char item = 'A';

    // 9) Tipe Data Reference
    // Tipe data reference merupakan sebuah tipe data yang merujuk ke sebuah objek atau instance dari sebuah class.
    // Salah satu tipe data yang termasuk ke dalam tipe data reference adalah string. Tipe data string menunjuk ke
    // instance dari class java.lang.String.

    Gitar user = new Gitar();
}
