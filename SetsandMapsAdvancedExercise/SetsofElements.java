package SetsandMapsAdvancedExercise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class SetsofElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] data = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt)
                .toArray();
        int n = data[0];
        int m = data[1];
        HashSet<String> first = new HashSet<>();
        HashSet<String> second = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String line = scan.nextLine();
            first.add(line);
        }
        for (int i = 0; i < m; i++) {
            String line = scan.nextLine();
            second.add(line);
        }
        for (String element1 : first) {
            for (String element2 : second) {
                if (element1.equals(element2)) {
                    System.out.print(element1 + " ");
                }
            }
        }
    }
}
