package com.mateuszzbylut.Composite;

import java.util.ArrayList;

public class Group implements AbstractItem {

    private String name;
    private ArrayList<Object> includedItems = new ArrayList<>();

    public Group(String  name) {
        this.name = name;
    }

    public void add(Object obj) {
        includedItems.add(obj);
    }

    @Override
    public void ls() {
        System.out.println(Client.compositeBuilder + name);
        Client.compositeBuilder.append("  ");
        for (Object includedItem : includedItems) {
            AbstractItem obj = (AbstractItem) includedItem;
            obj.ls();
        }
        Client.compositeBuilder.setLength(Client.compositeBuilder.length());
    }
}
