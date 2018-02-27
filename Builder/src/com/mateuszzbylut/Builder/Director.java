package com.mateuszzbylut.Builder;

import com.mateuszzbylut.Builder.entites.House;

public class Director {

    private Builder builder;

    Director(Builder builder) {
        this.builder = builder;
    }

    public void buildHouse() {
        builder.buildWalls();
        builder.buildRoof();
    }

    public House getHouse() {
        return this.builder.getHouse();
    }
}
