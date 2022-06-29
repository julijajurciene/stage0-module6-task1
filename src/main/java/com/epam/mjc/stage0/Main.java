package com.epam.mjc.stage0;

public class Main {
    public static void main(String[] args) {
        Animal newAnimal = new Animal("brown", 4, true);
        System.out.println(newAnimal.getDescription());

        Animal otherAnimal = new Animal("blue", 2, false);
        System.out.println(otherAnimal.getDescription());

        Animal bird = new Bird();
        System.out.println(bird.getDescription());
    }
}
