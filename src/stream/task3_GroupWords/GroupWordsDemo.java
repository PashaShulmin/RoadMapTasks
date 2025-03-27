package stream.task3_GroupWords;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsDemo {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "ant", "banana", "berry", "cherry", "carrot");

        Map<Character, List<String>> groupedWords = words.stream().collect(Collectors.groupingBy(w -> w.charAt(0)));

        System.out.println(groupedWords);
    }
}
