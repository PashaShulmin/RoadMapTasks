package stream;

// 2. Write a Java program to convert a list of strings to uppercase or lowercase using streams.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");

        List<String> lowerCase = colors.stream().map(String::toLowerCase).toList();
        List<String> upperCase = colors.stream().map(s -> s.toUpperCase()).toList();

        System.out.println(lowerCase);
        System.out.println(upperCase);
    }
}
