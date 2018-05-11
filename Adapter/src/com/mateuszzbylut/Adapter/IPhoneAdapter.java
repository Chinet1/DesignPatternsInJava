package com.mateuszzbylut.Adapter;

public class IPhoneAdapter implements FormatAndroidPhone {

    private FormatIPhone mobile;

    IPhoneAdapter(FormatIPhone mobile) {
        this.mobile = mobile;
    }

    @Override
    public void useMicroUsb() {
        System.out.println("MicroUSB Adapter connected");
        this.mobile.useLightning();
    }

    @Override
    public void recharge() {
        this.mobile.recharge();
    }
}
