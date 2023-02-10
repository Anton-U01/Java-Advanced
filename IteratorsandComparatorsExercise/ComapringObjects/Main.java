package IteratorsandComparatorsExercise.ComapringObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        List<Person> personList = new ArrayList<>();
        while (!line.equals("END")) {
            String[] data = line.split(" ");
            String name = data[0];
            int age = Integer.parseInt(data[1]);
            String town = data[2];
            Person person = new Person(name, age, town);
            personList.add(person);
            line = scan.nextLine();
        }
        int index = Integer.parseInt(scan.nextLine());
        if (index < personList.size() && index >= 0) {
            Person personToCompare = personList.get(index);
            int equalCount = 0;
            int notEqualCount = 0;
            for (Person person : personList) {
                int result = person.compareTo(personToCompare);
                if (result == 0) {
                    equalCount++;
                } else {
                    notEqualCount++;
                }
            }
            System.out.println(equalCount + " " + notEqualCount + " " + personList.size());
        } else {
            System.out.println("No matches");
        }
    }
}
