package IteratorsandComparatorsExercise.ListyIterator;

import IteratorsandComparatorsExercise.ListyIterator.ListIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        List<String> list = Arrays.stream(line.split(" ")).skip(1).collect(Collectors.toList());
        ListIterator iterator = new ListIterator(list);
        while (!line.equals("END")){
            switch (line){
                case "Move":
                    try {
                        System.out.println(iterator.move());
                    } catch (Exception e){
                        System.out.println(false);
                    }
                    break;
                case "HasNext":
                    System.out.println(iterator.hasNext());
                    break;
                case "Print":
                    try {
                        iterator.Print();
                    } catch (Exception e){
                        System.out.println("Invalid Operation!");
                    }
                    break;
            }

            line = scan.nextLine();
        }
    }
}
