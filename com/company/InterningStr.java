package com.company;

public class InterningStr {
    public static void main(String[] args) {
        String s1 = "YapStone";
        String s2 = "YapStone";
        String s3 = new String("YapStone");
        System.out.println("s1 == s2 ? " + (s1 == s2));
        System.out.println("s1 == s3 ? " + (s1 == s3));
        System.out.println("s1 equals s3 ? " + (s1.equals(s3)));

        String s11 = new String("Hai");
        String s22 = new String("HAI");
        System.out.println(s11 == s22);

        new InterningStr().foo("null");
    }

    public void foo(String s) {
        System.out.println("String");
    }

    public void foo(StringBuffer sb){
        System.out.println("StringBuffer");
    }

    public void foo(Object e){
        System.out.println("Yes It's Object");
    }
}

