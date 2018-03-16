package com.mateuszzbylut.Prototype;

public class Client {

    public static void main(String[] args) {

        Book java = PrototypeFactory.getPrototype("Java");
        java.info();

        Book android = PrototypeFactory.getPrototype("Android");
        android.info();
    }
}
