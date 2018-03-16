package com.mateuszzbylut.FactoryMethod;

public class Client {

    public static void main(String[] args) {
        HumanFactory humanFactory = new HumanFactory();

        Human American = humanFactory.getHuman("US");
        American.sayHello();

        Human Pole = humanFactory.getHuman("PL");
        Pole.sayHello();

        Human Spanish = humanFactory.getHuman("ES");
        Spanish.sayHello();
    }
}
