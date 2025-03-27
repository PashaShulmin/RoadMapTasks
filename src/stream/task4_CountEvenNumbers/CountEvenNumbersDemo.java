package stream.task4_CountEvenNumbers;

import java.util.List;

public class CountEvenNumbersDemo {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 15, 20, 25, 30, 35);

        System.out.println(numbers.stream().filter(n -> n % 2 == 0).count());
    }
}
