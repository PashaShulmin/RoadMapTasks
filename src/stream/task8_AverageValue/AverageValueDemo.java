package stream.task8_AverageValue;

import java.util.List;
import java.util.OptionalDouble;

public class AverageValueDemo {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40, 50);

        OptionalDouble average = numbers.stream().mapToInt(n -> n).average();

        System.out.println(average.getAsDouble());
    }
}
