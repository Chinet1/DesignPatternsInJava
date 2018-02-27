package com.mateuszzbylut.Builder;

import com.mateuszzbylut.Builder.entites.House;
import com.mateuszzbylut.Builder.entites.Roof;
import com.mateuszzbylut.Builder.entites.Walls;

public class CommonHouse implements Builder {

    private House commonHouse;

    CommonHouse() {
        this.commonHouse = new House();
    }

    @Override
    public void buildWalls() {
        Walls walls = new Walls();
        walls.setType("Brick");
        walls.setAmount(4);

        commonHouse.setWalls(walls);
    }

    @Override
    public void buildRoof() {
        Roof roof = new Roof();
        roof.setType("ceramic tile");
        roof.setColor("red");

        commonHouse.setRoof(roof);
    }

    @Override
    public House getHouse() {
        return this.commonHouse;
    }
}
