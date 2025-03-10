package stream;

// 6. Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.

import java.util.Arrays;
import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");

        List<String> ascending = colors.stream().sorted().toList();
        List<String> descending = colors.stream().sorted((s1, s2) -> s2.compareTo(s1)).toList();

        System.out.println(ascending);
        System.out.println(descending);
    }
}
