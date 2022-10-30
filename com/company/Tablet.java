package com.company;

interface Gadget {
    void doStuff();
}

public class Tablet extends Electronic implements com.company.MyInterface {

    public static void main(String[] args) {
        new Tablet().doStuff();
        new Tablet().getPower();
        com.company.MyInterface.m1();
    }

    void doStuff() {
        System.out.println("show book");
    }

    @Override
    public short m4() {
        return com.company.MyInterface.super.m4();
    }


}

abstract class Electronic {
    void getPower() {
        System.out.println("plug in");
    }
}