package practice.com.company.practice.oca8part2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeLists {

    public static void main(String[] args) {
        List<String> firstList = new ArrayList<>();
        firstList.add("1");

        List<String> ndList = new ArrayList<>();
        ndList.add("2");

        final List<String> allItems = Stream.of(firstList, ndList)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        allItems.forEach(s -> System.out.println("Items: "+ s.toLowerCase()));
    }
}
