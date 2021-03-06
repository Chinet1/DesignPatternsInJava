package com.mateuszzbylut.Builder.entites;

public class Roof {

    private String type;
    private String color;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Roof{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
