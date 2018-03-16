package com.mateuszzbylut.Prototype;

import java.util.HashMap;
import java.util.Map;

class PrototypeFactory {

    private static final Map<String, Book> prototypes = new HashMap<>();

    static {
        prototypes.put("android", new AndroidBook());
        prototypes.put("java", new JavaBook());
    }

    public static Book getPrototype(String type) {
        return prototypes.get(type.toLowerCase()).clone();
    }
}
