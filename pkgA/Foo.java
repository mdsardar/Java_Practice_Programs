package practice.pkgA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Foo {
    public int c = 7;
    protected int b = 6;
    int a = 5;

    public static void main(String[] args) {
        System.out.println("Good learning");

        Integer a[][]={{1,3,4},{2,4,3}};

        System.out.println("The content:"+ a.length);
        List<Integer> numbersList = new ArrayList<>();

        numbersList.add(3);
        numbersList.add(7);
        numbersList.add(9);
        numbersList.add(3);
        numbersList.add(0);
        //numbersList.add(-3);

        /*Stream<Integer> uniq = numbersList.stream().findFirst().stream().distinct();

        uniq.forEach(System.out::println);*/

        Integer intMin = numbersList.stream().min(Integer::compare).get();

        System.out.println("The min element in the list:"+ intMin);
    }
}


