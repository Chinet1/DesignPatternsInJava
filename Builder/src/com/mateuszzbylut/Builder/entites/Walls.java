package com.mateuszzbylut.Builder.entites;

public class Walls {

    private String type;
    private int amount;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Walls{" +
                "type='" + type + '\'' +
                ", amount=" + amount +
                '}';
    }
}
