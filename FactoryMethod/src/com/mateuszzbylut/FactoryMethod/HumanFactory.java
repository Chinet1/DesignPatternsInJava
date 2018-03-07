package com.mateuszzbylut.FactoryMethod;

public class HumanFactory {

    public Human getHuman(String countryCode) {
        if (countryCode == null) {
            return null;
        } else if (countryCode.equalsIgnoreCase("US")) {
            return new American();
        } else if (countryCode.equalsIgnoreCase("PL")) {
            return new Pole();
        } else if (countryCode.equalsIgnoreCase("ES")) {
            return new Spanish();
        }
        return null;
    }
}
