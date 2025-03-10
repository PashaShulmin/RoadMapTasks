package stream;

import java.util.Arrays;
import java.util.List;

//5. Write a Java program to count the number of strings in a list that start with a specific letter using streams.



public class Task5 {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");

        long count = colors.stream().filter(s -> s.charAt(0) == 'B').count();

        System.out.println(count);
    }
}
