package stream.task2_MapToSquare;

import java.util.ArrayList;
import java.util.List;
import java.util.random.RandomGenerator;
import java.util.stream.Collectors;

public class SquareNumbersDemo {
    public static void main(String[] args) {
        List<Long> numbers = RandomGenerator.getDefault().longs(5, -1000, 1001)
                .collect(
                        ArrayList::new,
                        ArrayList::add,
                        ArrayList::addAll
                );

        System.out.println(numbers);

        List<Long> squares = numbers.stream().map(n -> n * n).toList();

        System.out.println(squares);
    }
}
