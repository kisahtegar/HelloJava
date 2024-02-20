package com.dicoding.javafundamental.generics;

import java.util.ArrayList;
import java.util.Collection;

public class WildcardVSGenericsMethod {
    // Menggunakan wildcard
    static void print(Collection<?> col) {
        for (Object o : col) {
            System.out.println(o);
        }
    }

    // Menggunakan generic methods
    static <T> Collection arrayToCollection(T[] a) {
        Collection<T> col = new ArrayList<>();

        for (T o : a) {
            col.add(o);
        }
        return col;
    }

    public static void main(String[] args) {
        String[] sa = {"Happy", "Coding"};
        Collection r = arrayToCollection(sa);

        print(r);
    }
}
