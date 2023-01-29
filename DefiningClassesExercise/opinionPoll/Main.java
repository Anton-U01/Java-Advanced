package DefiningClassesExercise.opinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Person> persons = new ArrayList<>();
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String[] data = scan.nextLine().split(" ");
            String name = data[0];
            int age = Integer.parseInt(data[1]);
            Person person = new Person(name,age);
            persons.add(person);
        }
        persons.stream().filter(p -> p.age > 30).sorted(Comparator.comparing(Person::getName)).forEach(person -> {
            System.out.println(person.personInfo());
        });
    }
}
