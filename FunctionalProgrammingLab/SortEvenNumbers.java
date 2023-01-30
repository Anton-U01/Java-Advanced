package FunctionalProgrammingLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] numbers = scan.nextLine().split(", ");
        List<String> even = Arrays.stream(numbers)
                .map(e -> Integer.parseInt(e))
                .filter(e -> e % 2 == 0)
                .map(e -> e.toString())
                .collect(Collectors.toList());
        System.out.println(String.join(", ",even));
        List<String> evenSorted = Arrays.stream(numbers)
                .map(e -> Integer.parseInt(e))
                .filter(e -> e % 2 == 0)
                .sorted()
                .map(e -> e.toString())
                .collect(Collectors.toList());
        System.out.println(String.join(", ",evenSorted));

    }
}
