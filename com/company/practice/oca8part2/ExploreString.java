package practice.com.company.practice.oca8part2;


class A {
    void m1() {
        System.out.println("Print method from base class");
    }
}

class B extends A {
    void m1() {
        System.out.println("Print method from sub class");
    }
}

public class ExploreString {
    public static void main(String[] args) {

        /*A a = new A();
        a.m1();

        B b = new B();
        b.m1();*/

        String a = "test";

        String a1 = "test";

        System.out.println(a == a1);

        System.out.println(a.concat("tue"));

        String b = new String("Test");
        //b = b.concat("BInString");

        System.out.println("Print String" + b.concat("BInString"));

        String c = new String("Test");

        System.out.println(b == c);

    }
}
