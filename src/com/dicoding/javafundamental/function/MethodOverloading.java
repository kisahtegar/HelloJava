package com.dicoding.javafundamental.function;

/**
 * Method overloading is a feature in Java that allows you to define multiple methods in a class with the same name but
 * with different parameter lists. These methods can have different types or numbers of parameters. When you invoke an
 * overloaded method, Java determines which version of the method to execute based on the arguments provided.
 */
public class MethodOverloading {
    public static void main(String[] args) {
        double p = 7;
        double l = 6.5;
        double hasil = hitungLuas(p, l);
        System.out.println("Hasilnya adalah = " + hasil);
        int pn = 7;
        int lb = 6;
        int hsl = hitungLuas(pn, lb);
        System.out.println("Hasilnya adalah = " + hsl);
    }
    public static double hitungLuas(double panjang, double lebar) {
        double luas = panjang * lebar;
        return luas;
    }
    public static int hitungLuas(int panjang, int lebar) {
        int luas = panjang * lebar;
        return luas;
    }
}
