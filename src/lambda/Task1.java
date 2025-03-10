package lambda;

import java.util.Scanner;

// 1. Write a Java program to implement a lambda expression to find the sum of two integers.

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        SumCalculator calc = (x, y) -> x + y;
        System.out.println(calc.sum(a, b));
    }
}

interface SumCalculator {
    int sum (int a, int b);
}
