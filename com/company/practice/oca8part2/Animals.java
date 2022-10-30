package practice.com.company.practice.oca8part2;//package com.company.practice.oca8part2;

import com.company.practice.oca8part2.MultiResources;

public class Animals {
    public static void main(String[] args) throws Exception {
        new Animals().run();
    }

    public void run() throws Exception {
        try (Lamb l = new Lamb();) {
        } finally {
        }
    }

    class Lamb implements AutoCloseable {
        public void close() throws Exception {
            System.out.println("Closed");

        }
    }
}
