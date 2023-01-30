package FunctionalProgrammingLab;

import java.lang.invoke.CallSite;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AddVAT {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] line = scan.nextLine().split(", ");
        List<Double> priceWithVat= Arrays.stream(line)
                .map(Double::parseDouble)
                .map(e -> e * 1.2)
                .collect(Collectors.toList());
        System.out.println("Prices with VAT:");
        for (Double aDouble : priceWithVat) {
            System.out.printf("%.2f%n", aDouble);
        }
    }
}
