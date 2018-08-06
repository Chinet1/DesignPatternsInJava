package com.mateuszzbylut.Composite;

public class Song implements AbstractItem {

    private String  name;

    public Song(String  name) {
        this.name = name;
    }

    @Override
    public void ls() {
        System.out.println(Client.compositeBuilder + name);
    }
}
