package stream.task5_MinString;

import java.util.List;
import java.util.Optional;

public class MinStringDemo {
    public static void main(String[] args) {
        List<String> strings = List.of("elephant", "cat", "hippopotamus", "dog", "lion");

        Optional<String> string = strings.stream().min((s1, s2) -> s1.length() - s2.length());

        System.out.println(string.orElse("Not exist"));
    }
}
