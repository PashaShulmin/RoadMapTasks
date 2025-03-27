package stream.task1_FilterPerson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.random.RandomGenerator;

public class PersonFilterDemo {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        String[] names = new String[]{"Pasha", "Masha", "Kamil", "Egor", "Alena", "Pasha", "Margo", "Kirill", "Semen", "Aleksei"};
        int[] ages = RandomGenerator.getDefault().ints(10, 18, 81).toArray();

        for (int i = 0; i < 10; i++) {
            people.add(new Person(names[i], ages[i]));
        }
        System.out.println(people);

        List<Person> filteredPeople = people.stream().filter(p -> p.getAge() > 30).toList();
        System.out.println(filteredPeople);
    }
}
