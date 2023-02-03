package FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        String line = scan.nextLine();
        Function<Integer,Integer> add = e -> e + 1;
        Function<Integer,Integer> subtract = e -> e - 1;
        Function<Integer,Integer> multiply = e -> e * 2;
        Consumer <Integer> print = e -> System.out.print(e + " ");
        while (!line.equals("end")){
            switch (line){
                case "add":
                    numbers = numbers.stream().map(e -> add.apply(e)).collect(Collectors.toList());
                    break;
                case "print":
                    numbers.stream().forEach( e -> print.accept(e));
                    break;
                case "multiply":
                    numbers = numbers.stream().map(e -> multiply.apply(e)).collect(Collectors.toList());
                    break;
                case "subtract":
                    numbers = numbers.stream().map(e -> subtract.apply(e)).collect(Collectors.toList());
                    break;
            }
            line = scan.nextLine();
        }
    }
}
