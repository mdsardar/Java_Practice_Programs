package practice.com.company;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerForEach {
    public static void main(String[] geos) {
        List<String> doggies  = Arrays.asList("foo", "boo", "husky");
        Consumer<String> printNames = name -> System.out.println(name);
        doggies.forEach(name -> System.out.println(name));
    }
}
