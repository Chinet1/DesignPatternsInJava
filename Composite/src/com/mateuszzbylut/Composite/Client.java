package com.mateuszzbylut.Composite;

public class Client {

    static StringBuffer compositeBuilder = new StringBuffer();

    public static void main(String[] args) {
        Group music = new Group("Music");
        Group rock = new Group("Rock");
        Group acdc = new Group("AC/DC");
        Group theRazorEdge = new Group("The Razor Edge");
        Song track1 = new Song("Rock or Bust");
        Song track2 = new Song("Shake It Off");
        Song track3 = new Song("Thunderstruck");
        Song track4 = new Song("Fire Your Guns");
        music.add(track2);
        music.add(rock);
        rock.add(acdc);
        acdc.add(track1);
        acdc.add(theRazorEdge);
        theRazorEdge.add(track3);
        theRazorEdge.add(track4);
        music.ls();
    }
}
