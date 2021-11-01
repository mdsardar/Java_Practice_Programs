package com.company;

enum Animals {
    DOG("LOL"),
    CAT("MEOW"),
    FISH("burple");
    String sound;

    Animals(String s) {
        this.sound = s;
    }
}

public class TestEnum {
    static Animals animals;

    public static void main(String[] args) {
        System.out.println(animals.DOG.sound + " " + animals.FISH.sound);
    }
}