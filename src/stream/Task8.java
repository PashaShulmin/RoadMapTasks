package stream;

import java.util.ArrayList;
import java.util.random.RandomGenerator;

// 8. Write a Java program to find the second smallest and largest elements in a list of integers using streams.

public class Task8 {
    public static void main(String[] args) {
        ArrayList<Integer> list = RandomGenerator.getDefault().ints(7, 0, 26).collect(
                ArrayList::new,
                ArrayList::add,
                ArrayList::addAll
        );
        System.out.println(list);

        Integer secondMin = list.stream().sorted().limit(2).max(Integer::compareTo).get();
        Integer secondMax = list.stream().sorted((e1, e2) -> e2 - e1).limit(2).min(Integer::compareTo).get();

        System.out.println(secondMin + " " + secondMax);
    }
}
