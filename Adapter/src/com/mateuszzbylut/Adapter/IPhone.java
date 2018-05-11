package com.mateuszzbylut.Adapter;

public class IPhone implements FormatIPhone {

    private boolean connected = false;

    @Override
    public void useLightning() {
        connected = true;
        System.out.println("Lightning connected");
    }

    @Override
    public void recharge() {
        if (connected) {
            System.out.println("Recharging...");
        } else {
            System.out.println("Connect Lightning first");
        }
    }
}
