package lambda;

import java.util.Scanner;
import java.util.function.Predicate;

// 2. Write a Java program to implement a lambda expression to check if a given string is empty.

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = "";//scanner.next();
        StringChecker sc = s -> s.isEmpty();
        Predicate<String> p =  s -> s.isEmpty();
        System.out.println(p.test(string));
    }
}

interface StringChecker {
    boolean check (String s);
}
