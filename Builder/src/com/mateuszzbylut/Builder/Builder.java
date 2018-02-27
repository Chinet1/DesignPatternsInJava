package com.mateuszzbylut.Builder;

import com.mateuszzbylut.Builder.entites.House;

public interface Builder {

    void buildWalls();

    void buildRoof();

    House getHouse();
}
