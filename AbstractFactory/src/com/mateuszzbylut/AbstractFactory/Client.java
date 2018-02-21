package com.mateuszzbylut.AbstractFactory;

public class Client {

    public static void main(String[] args) {
        TableFactory factory;
        Table table;

        factory = new OakWoodFactory();
        table = factory.createTable();
        table.treeSpecies();

        System.out.println("Next Factory:");

        factory = new BeechWoodFactory();
        table = factory.createTable();
        table.treeSpecies();
    }
}
