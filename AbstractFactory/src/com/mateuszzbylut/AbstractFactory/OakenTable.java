package com.mateuszzbylut.AbstractFactory;

public class OakenTable implements Table {
    @Override
    public void treeSpecies() {
        System.out.println("This table is made of Oakwood.");
    }
}
