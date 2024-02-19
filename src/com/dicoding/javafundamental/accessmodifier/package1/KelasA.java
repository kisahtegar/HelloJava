package com.dicoding.javafundamental.accessmodifier.package1;

public class KelasA {
    private int memberA = 5;
    char memberB = 'A';
    double memberC = 1.5;

    private int functionA() {
        return memberA;
    }

    int functionB() {
        // Pemanggilan private member dan private function
        int hasil = functionA() + memberA;
        return hasil;
    }

    /**
     * In the KelasA class, the methodC() method is declared with the protected access modifier. This means it can be
     * accessed within the same package (package1) and by subclasses of KelasA, regardless of the package they're in.
     */
    protected void methodC(){
        System.out.println("Percobaan access modifier!!!");
    }

}
