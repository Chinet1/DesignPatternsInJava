package com.mateuszzbylut.AbstractFactory;

public class BeechenTable implements Table {
    @Override
    public void treeSpecies() {
        System.out.println("This table is made of beechwood.");
    }
}
