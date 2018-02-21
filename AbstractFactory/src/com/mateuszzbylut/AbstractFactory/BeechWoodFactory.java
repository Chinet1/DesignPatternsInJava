package com.mateuszzbylut.AbstractFactory;

public class BeechWoodFactory implements TableFactory {
    @Override
    public Table createTable() {
        return new BeechenTable();
    }
}
