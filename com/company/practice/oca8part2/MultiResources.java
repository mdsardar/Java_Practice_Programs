package com.company.practice.oca8part2;

public class MultiResources {
    class Lamb implements AutoCloseable {
        public void close() throws Exception {
            System.out.println("1");
        }
    }

    class Goat implements AutoCloseable {
        public void close() throws Exception {
            System.out.println("g");
        }
    }

    public static void main(String[] args) throws Exception {
        new MultiResources().run();
    }
    public void run() throws Exception {
        try (Lamb l = new Lamb();
             Goat g = new Goat();) {
            System.out.println("2");
        } finally {
            System.out.println("f");
        }
    }
}
