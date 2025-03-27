package stream.task9_PersonToMap;

import stream.task1_FilterPerson.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.random.RandomGenerator;
import java.util.stream.Collectors;

public class PersonToMapDemo {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        String[] names = new String[]{"Pasha", "Masha", "Kamil", "Egor", "Alena", "Dasha", "Margo", "Kirill", "Semen", "Aleksei"};
        int[] ages = RandomGenerator.getDefault().ints(10, 18, 81).toArray();

        for (int i = 0; i < 10; i++) {
            people.add(new Person(names[i], ages[i]));
        }

        Map<String, Integer> map = people.stream().collect(Collectors.toMap(Person::getName, Person::getAge));

        System.out.println(map);
    }
}
