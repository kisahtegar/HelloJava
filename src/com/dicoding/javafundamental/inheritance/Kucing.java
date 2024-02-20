package com.dicoding.javafundamental.inheritance;

public class Kucing extends Hewan {
    private String ras;
    private String habitat;

    public Kucing(String ras, String habitat) {
        this.ras = ras;
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Kucing ras: " + ras + ", habitat: " + habitat;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Kucing) {
            // If obj is an instance of Kucing, it is cast to a Kucing object (other).
            Kucing other = (Kucing) obj;
            return this.ras.equals(other.ras);
        } else {
            return false;
        }
    }

    public Kucing() {
        super(); // akan tetap memanggil constructor dari parent Class
        System.out.println("construct Kucing");
    }

    // This method override from Hewan class
    @Override
    public void makan() {
        System.out.println("Kucing sedang makan..");
    }

    // This method overloading
    public void makan(String food) {
        System.out.println("Kucing makan " + food);
    }
}
