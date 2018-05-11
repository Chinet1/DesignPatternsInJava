package com.mateuszzbylut.Adapter;

public class Client {

    public static void main(String[] args) {
        System.out.println("Recharging IPhone with Lightning cable");
        IPhone iPhone = new IPhone();
        iPhone.useLightning();
        iPhone.recharge();

        System.out.println("=====================================");

        System.out.println("Recharging Android Phone with MicroUSB cable");
        AndroidPhone androidPhone = new AndroidPhone();
        androidPhone.useMicroUsb();
        androidPhone.recharge();

        System.out.println("=====================================");

        System.out.println("Recharging IPhone with MicroUSB cable");
        IPhone phone = new IPhone();
        IPhoneAdapter adapter = new IPhoneAdapter(phone);
        adapter.useMicroUsb();
        adapter.recharge();
    }

}
