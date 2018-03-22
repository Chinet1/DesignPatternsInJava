package com.mateuszzbylut.Singleton;

public class Client {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        singleton.sayHello();
    }
}
