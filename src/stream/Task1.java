package stream;

// 1. Write a Java program to calculate the average of a list of integers using streams.

import java.util.ArrayList;
import java.util.random.RandomGenerator;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = RandomGenerator.getDefault().ints(5, 0, 10).collect(
                ArrayList::new,
                ArrayList::add,
                ArrayList::addAll
        );
        System.out.println(list);

        Double mean = list.stream().map(e -> (double) e / list.size()).reduce(0.0, Double::sum);

        System.out.printf("%.3f", mean);
    }
}
