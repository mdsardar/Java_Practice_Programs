package com.company;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> s1= Optional.of("A");
        System.out.println(s1);

        String s2 = Optional.of("A").orElseGet(() -> "B");
        System.out.println(s2);

        String s3 = Optional.of("AS3").toString();
        System.out.println(s3 + "You");


    }
}
