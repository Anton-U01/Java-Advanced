package IteratorsandComparatorsExercise.StrategyPattern;


import com.sun.source.tree.Tree;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        TreeSet<Person> personsByName = new TreeSet<>(new NameComparator());
        TreeSet<Person> personsByAge = new TreeSet<>(new AgeComparator());
        for (int i = 0; i < n; i++) {
            String[] data = scan.nextLine().split(" ");
            String name = data[0];
            int age = Integer.parseInt(data[1]);
            Person person = new Person(name,age);
            personsByAge.add(person);
            personsByName.add(person);
        }
        for (Person person : personsByName) {
            System.out.println(person.getName() + " " + person.getAge());
        }
        for (Person person : personsByAge) {
            System.out.println(person.getName() + " " + person.getAge());
        }
    }
}
