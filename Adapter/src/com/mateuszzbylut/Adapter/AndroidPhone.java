package com.mateuszzbylut.Adapter;

public class AndroidPhone implements FormatAndroidPhone {

    private boolean connected = false;

    @Override
    public void useMicroUsb() {
        connected = true;
        System.out.println("MicroUSB connected");
    }

    @Override
    public void recharge() {
        if (connected) {
            System.out.println("Recharging...");
        } else  {
            System.out.println("Connect MicroUSB first");
        }
    }
}
