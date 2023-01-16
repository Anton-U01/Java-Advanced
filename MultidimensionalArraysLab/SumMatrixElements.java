package MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int rowsCount = dimensions[0];
        int colsCount = dimensions[1];
        System.out.println(rowsCount);
        System.out.println(colsCount);
        int sum = 0;
        int[][] matrix = new int[rowsCount][colsCount];
        for (int row = 0; row < rowsCount; row++) {
            int[] line = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            for (int col = 0; col < colsCount; col++) {
                matrix[row][col] = line[col];
                sum += matrix[row][col];
            }
        }
        System.out.println(sum);
    }
}
