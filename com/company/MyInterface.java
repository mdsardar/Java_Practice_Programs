package com.company;

public interface MyInterface {
    static void m1() {;}
    default void m2() {;}
    //int m3();
    default short m4() { return 5;}
}