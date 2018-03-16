package com.mateuszzbylut.Prototype;

public class AndroidBook implements Book {

    private final String INFO = "Book about Android";

    @Override
    public Book clone() {
        return new AndroidBook();
    }

    @Override
    public void info() {
        System.out.println(INFO);
    }
}
