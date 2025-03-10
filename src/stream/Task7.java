package stream;

// 7. Write a Java program to find the maximum and minimum values in a list of integers using streams.

import java.util.ArrayList;
import java.util.random.RandomGenerator;

public class Task7 {
    public static void main(String[] args) {
        ArrayList<Integer> list = RandomGenerator.getDefault().ints(10, -100, 101).collect(
                ArrayList::new,
                ArrayList::add,
                ArrayList::addAll
        );
        System.out.println(list);

        Integer max = list.stream().max(Integer::compareTo).get();
        Integer min = list.stream().min(Integer::compareTo).get();

        System.out.printf("min: %s max: %s", min, max);
    }
}
