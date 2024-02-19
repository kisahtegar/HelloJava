package com.dicoding.javafundamental.accessmodifier.package2;

import com.dicoding.javafundamental.accessmodifier.package1.KelasA;

public class KelasB extends KelasA {
    /**
     * In the KelasB class, which is in a different package (package2), it extends KelasA. Since methodC() in KelasA is
     * declared as protected, KelasB can override and access this method.
     */
    @Override
    protected void methodC() {
        super.methodC();
        System.out.println("Contoh pemanggilan protected dari package luar");
    }
}
