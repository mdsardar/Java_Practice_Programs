package com.company;

class Animal {
    public void eat() throws Exception {
    }
}

public class Dog2 extends Animal {
    public static void main(String[] args) {
        Animal a = new Dog2();
        Dog2 d = new Dog2();
        d.eat();
        try {
            a.eat();
        }
        catch(Exception e) {}
    }

    public void eat() {
    }
}
