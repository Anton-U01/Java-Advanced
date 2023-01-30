package FunctionalProgrammingLab;

import java.util.Arrays;
import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] line = scan.nextLine().split(", ");
        int count = 0;
        System.out.println("Count = " + line.length);
        int sum =  Arrays.stream(line).mapToInt(e -> Integer.parseInt(e)).sum();
        System.out.println("Sum = " + sum);
    }
}
