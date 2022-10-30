package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void change(int x) {
        //x = 10;
        System.out.println(x);

        String course = "FCC";
        System.out.println(course instanceof Object);

        String str = "This is a string";
        String str2 = "This is a string";
        String str3 = "This is a string";

        String str4 = new String("This is a string");


        System.out.println(str == str2); // This prints 'true'
        System.out.println(str == str3); // This prints 'true'
        System.out.println(str.equals(str3)); // This prints 'true'
        System.out.println(str == str4); // This prints 'true'

    }

    public static void main(String[] args) {
        int x = 5;
        change(x);
        System.out.println(x);
    }
}