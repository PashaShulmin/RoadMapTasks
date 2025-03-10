package stream;

//4. Write a Java program to remove all duplicate elements from a list using streams.

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.random.RandomGenerator;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = RandomGenerator.getDefault().ints(10, 1, 6).collect(
                ArrayList::new,
                ArrayList::add,
                ArrayList::addAll
        );
        System.out.println(list);

        Set<Integer> set = list.stream().collect(Collectors.toSet());

        // Вариант если надо сохранить порядок
        List<Integer> list1 = list.stream().distinct().collect(Collectors.toList());

        System.out.println(set);
        System.out.println(list1);
    }
}
