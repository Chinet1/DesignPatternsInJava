package com.mateuszzbylut.AbstractFactory;

public class OakWoodFactory implements TableFactory {
    @Override
    public Table createTable() {
        return new OakenTable();
    }
}
