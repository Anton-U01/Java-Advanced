package FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CustomComparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        Predicate<Integer> checkIfEven = e -> e % 2 == 0;
        Predicate<Integer> checkIfOdd = e -> e % 2 != 0;
        numbers.stream().filter(checkIfEven)
                .sorted()
                .forEach(e -> System.out.print(e + " "));
        numbers.stream().filter(checkIfOdd)
                .sorted()
                .forEach(e -> System.out.print(e + " "));
    }
}
