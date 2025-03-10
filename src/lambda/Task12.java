package lambda;

import java.util.List;

// 12. Write a Java program to create a lambda expression to multiply and sum all elements in a list of integers.

public class Task12 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        Counter<Integer> m1 = list1 -> list1.stream().reduce(1, (x, y) -> x * y);
        Counter<Integer> m2 = list1 -> list1.stream().reduce(0, Integer::sum);
        System.out.println(m1.calculate(list));
        System.out.println(m2.calculate(list));
    }
}

interface Counter<T extends Number> {
    T calculate(List<T> list);
}
