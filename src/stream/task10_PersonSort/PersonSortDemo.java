package stream.task10_PersonSort;

import stream.task1_FilterPerson.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.random.RandomGenerator;
import java.util.stream.Stream;

public class PersonSortDemo {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        String[] names = new String[]{"Pasha", "Masha", "Kamil", "Egor", "Alena", "Dasha", "Margo", "Kirill", "Semen", "Aleksei"};
        int[] ages = RandomGenerator.getDefault().ints(10, 18, 20).toArray();

        for (int i = 0; i < 10; i++) {
            people.add(new Person(names[i], ages[i]));
        }

        List<Person> list = people.stream().sorted((p1, p2) -> {
            if (p1.getAge() == p2.getAge()) {
                return p1.getName().compareTo(p2.getName());
            } else {
                return p1.getAge() - p2.getAge();
            }
        }).toList();

        System.out.println(list);
    }
}
