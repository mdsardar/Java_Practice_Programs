package com.company;


class NullNestedChecks implements MyInterface {

    static Home home;

    public static void main(String[] s) {

        if (home == null && s.length!=0) {
            System.out.println("Yes Null");
        } else
            System.out.println("Not Null");
    }

}