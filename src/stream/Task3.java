package stream;

import java.util.ArrayList;
import java.util.random.RandomGenerator;

// 3. Write a Java program to calculate the sum of all even, odd numbers in a list using streams.

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = RandomGenerator.getDefault().ints(5, -100, 101).collect(
                ArrayList::new,
                ArrayList::add,
                ArrayList::addAll
        );

        System.out.println(list);

        Integer evenSum = list.stream().filter(e -> e % 2 == 0).reduce(0, Integer::sum);
        Integer oddSum = list.stream().filter(e -> e % 2 != 0).reduce(0, Integer::sum);

        System.out.println(evenSum + " " + oddSum);
    }
}
