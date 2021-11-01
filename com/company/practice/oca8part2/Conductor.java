package com.company.practice.oca8part2;

public class Conductor {
    static String s = "-";

    public static void main(String[] args) {
        new Conductor().run();
        System.out.println(s);
    }

    public void run() {
        try (Whistle w = new Whistle()) {
            w.toot();
            s += "1";
            throw new Exception();
        } catch (Exception e) {
            s += "2";
        } finally {
            s += "3";
        }
    }

    class Whistle implements AutoCloseable {
        public void toot() {
            s += "t";
        }

        public void close() {
            s += "c";
        }
    }
}
