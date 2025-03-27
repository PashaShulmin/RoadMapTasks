package stream.task7_JoinStrings;

import java.util.List;
import java.util.stream.Collectors;

public class JoinStringsDemo {
    public static void main(String[] args) {
        List<String> words = List.of("red", "green", "blue", "yellow");

        System.out.println(words.stream().collect(Collectors.joining(", ")));
    }
}
