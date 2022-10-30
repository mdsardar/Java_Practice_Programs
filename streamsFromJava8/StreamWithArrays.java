package practice.streamsFromJava8;

import java.util.Arrays;
import java.util.List;

public class StreamWithArrays {
    public static void main(String[] args) {
        List<Integer> nums =
                Arrays.asList(1, 2, 3, 4, 5, 6);

        long result = nums.stream()
                //.peek(b -> System.out.println("Number is: " + b + ", "))
                .map(b -> b * b)
                .filter(n -> n > 20)    
                //.peek(b -> System.out.println("Square is: " + b + ", "))
                .count();
        System.out.println("The count: " + result);
    }
}
