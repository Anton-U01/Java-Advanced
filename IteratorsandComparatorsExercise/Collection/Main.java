package IteratorsandComparatorsExercise.Collection;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        List<String> list = Arrays.stream(line.split(" ")).skip(1).collect(Collectors.toList());
        ListIterator1 iterator = new ListIterator1(list);
        while (!line.equals("END")) {
            switch (line) {
                case "Move":
                    try {
                        System.out.println(iterator.move());
                    } catch (Exception e) {
                        System.out.println(false);
                    }
                    break;
                case "HasNext":
                    System.out.println(iterator.hasNext());
                    break;
                case "Print":
                    try {
                        iterator.Print();
                    } catch (Exception e) {
                        System.out.println("Invalid Operation!");
                    }
                    break;
                case "PrintAll":
                    try {
                        iterator.PrintAll();
                    } catch (Exception e) {
                        System.out.println("Invalid Operation!");
                    }
                    break;
            }
            line = scan.nextLine();
        }
    }
}
