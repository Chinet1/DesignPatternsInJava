package com.mateuszzbylut.Builder;

import com.mateuszzbylut.Builder.entites.House;

public class Client {

    public static void main(String[] args) {

        Builder houseBuilder = new CommonHouse();
        Director houseDirector = new Director(houseBuilder);
        houseDirector.buildHouse();

        House commonHouse = houseDirector.getHouse();

        System.out.println(commonHouse);
    }
}
