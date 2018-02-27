package com.mateuszzbylut.Builder.entites;

public class House {

    private Walls walls;
    private Roof roof;

    public Walls getWalls() {
        return walls;
    }

    public void setWalls(Walls walls) {
        this.walls = walls;
    }

    public Roof getRoof() {
        return roof;
    }

    public void setRoof(Roof roof) {
        this.roof = roof;
    }

    @Override
    public String toString() {
        return "House{" +
                "walls=" + walls +
                ", roof=" + roof +
                '}';
    }
}
