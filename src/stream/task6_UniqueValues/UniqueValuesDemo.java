package stream.task6_UniqueValues;

import java.util.List;

public class UniqueValuesDemo {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 2, 4, 3, 5, 1);

        System.out.println(numbers.stream().distinct().toList());
    }
}
