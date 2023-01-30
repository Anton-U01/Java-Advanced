package FunctionalProgrammingLab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class FindEvensorOdds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] borders = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int start = borders[0];
        int end = borders[1];
        String type = scan.nextLine();
        Predicate<Integer> filter;
        if(type.equals("odd")){
            filter = (e -> e % 2 != 0);
        }else {
            filter = (e -> e % 2 == 0);
        }
        for (int i = start; i <= end; i++) {
            if(filter.test(i)){
                System.out.print(i + " ");
            };
        }
    }
}
