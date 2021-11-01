package com.company;


class Rocket {
    private void blastOff() {
        System.out.println("Rocket-bank");
    }
}

public class Shuttle {
    public static void main(String[] args) {
        new Shuttle().go();
    }

    void go() {
        blastOff();
        //Rocket.blastOff();
    }

    private void blastOff() {
        System.out.println("huss-bank");
    }
}
