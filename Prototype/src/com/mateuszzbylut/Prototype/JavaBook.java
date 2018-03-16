package com.mateuszzbylut.Prototype;

public class JavaBook implements Book {

    private final String INFO = "Book about Java";

    @Override
    public Book clone() {
        return new JavaBook();
    }

    @Override
    public void info() {
        System.out.println(INFO);
    }
}
