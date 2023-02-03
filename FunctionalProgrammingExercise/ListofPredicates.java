package FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListofPredicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        Predicate<Integer> checkIfDivisible = e -> {
            boolean b = true;
            for (Integer number : numbers) {
                if(e % number != 0){
                    return false;
                }
            }
            return b;
        };
        for (int i = 1; i <= n; i++) {
            if(checkIfDivisible.test(i)){
                System.out.print(i + " ");
            };
        }
    }
}
