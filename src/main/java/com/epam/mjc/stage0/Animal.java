package com.epam.mjc.stage0;

public class Animal {
    private final String color;
    private final int numberOfPaws;
    private final boolean hasFur;

    public Animal (String color, int numOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String answer;

        String paw;
        if (numberOfPaws == 1) {
            paw = "paw";
        } else {
            paw = "paws";
        }

        String fur;
        if (hasFur) {
            fur = "a";
        } else {
            fur = "no";
        }

        answer = "This animal is mostly " + color + ". It has " + numberOfPaws + " " + paw + " and " + fur + " fur.";

        return answer;
    }
}
