package com.company.practice.oca8part2;

public class StringSplitter {
    public static void main(String[] args) {
        String s = "dogs. with words.";
        String[] output = s.split("w");
        for (String o : output) {
            System.out.println(o + " ");
        }
    }
}
