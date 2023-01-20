package SetsandMapsAdvancedExercise;

import java.util.*;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Set<String> elements = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            String[] data = scan.nextLine().split("\\s++");
            elements.addAll(Arrays.asList(data));
        }
        for (String element : elements) {
            System.out.print(element + " ");
        }
    }
}
