package com.dicoding.javafundamental.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPlanet {
    public static void main(String[] args) {
        // menggunakan HashSet
        Set<String> planets = new HashSet<>();
        planets.add("mercury"); // method add() untuk menambahkan objek ke Set
        planets.add("venus");
        planets.add("earth");
        planets.add("earth"); // menambahkan objek "earth" beberapa kali
        planets.add("earth");
        planets.add("mars"); // objek bisa terus ditambahkan ke Set

        // method size() untuk mendapatkan ukuran Set
        System.out.println("Set planets awal: (size = " + planets.size() + ")");

        // this for-each loop iterates over the planets set, assigning each element to the variable planet, and then
        // printing each element with an indentation. It's a concise and readable way to iterate over collections in Java.
        for (String planet : planets) {
            System.out.println("\t " + planet);
        }

        planets.remove("venus"); // method remove() untuk mengeluarkan objek dari Set

        System.out.println("\nSet planets akhir: (size = " + planets.size() + ")");

        // the for loop in this context is iterating over the elements of the planets set using an Iterator. It
        // continues to iterate as long as there are more elements in the set (iterator.hasNext() returns true).
        for (Iterator iterator = planets.iterator(); iterator.hasNext(); ) {
            // looping menggunakan Iterator
            System.out.println("\t " + iterator.next());
        }
    }
}
