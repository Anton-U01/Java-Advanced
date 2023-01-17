package MultidimensionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            int[] row = Arrays.stream(scan.nextLine().split("\\s++"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[i] = row;
        }
        int sumOfPrimary = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j){
                    sumOfPrimary += matrix[i][j];
                }
            }
        }
        int sumOfSecondary = 0;
        for (int i = n - 1; i >= 0; i--) {
            sumOfSecondary += matrix[i][n - 1 - i];
        }
        System.out.println(Math.abs(sumOfPrimary - sumOfSecondary));
    }
}
