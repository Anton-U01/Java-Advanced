package FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] names = scan.nextLine().split(" ");
        Consumer<String> print = (s -> System.out.println(s));
        Arrays.stream(names).forEach(print);
    }
}
