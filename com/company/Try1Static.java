package com.company;

import java.util.ArrayList;
import java.util.List;

class Try2Static {
    public static final int myConstant = 343;
    public static final Try1Static t1S = new Try1Static();
    public int instVar = 42;

    public static void howdy() {
        System.out.println("howdy");
    }
}

public class Try1Static {
    public static void main(String[] ss) {
        Try2Static.howdy();
        System.out.println(Try2Static.myConstant + " ");
        //System.out.println(myConstant + " ");
        Try2Static.howdy();
        List<String> testStr = new ArrayList<>();

        /*ArrayList<String> testArrr = new ArrayList<>();
        System.out.println(instVar + " ");
        System.out.println(t1S.instVar + " ");*/

        String a = "Sam";
        String c = "Ram";
        String b = "maS";

        System.out.println(a.compareTo(b));
        System.out.println(a.compareTo(c));
        System.out.println(c.compareTo(a));

        // 0
        // 1 since (a>b)
        // -1 since (c<a)
    }
}
