package MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumof2X2Submatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int rowsCount = dimensions[0];
        int colsCount = dimensions[1];
        int[][] matrix = new int[rowsCount][colsCount];
        for (int row = 0; row < rowsCount; row++) {
            int[] line = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            for (int col = 0; col < colsCount; col++) {
                matrix[row][col] = line[col];
            }
        }
        int[][] matrix2x2 = new int[2][2];
        int rowIndex = 0;
        int colIndex = 0;
        int counterCols = 0;
        int biggestSum = 0;
        int currentSum = 0;
        while (true){
            for (int row = rowIndex; row < rowIndex + 2; row++) {
                for (int col = colIndex; col < colIndex + 2; col++) {
                    currentSum += matrix[row][col];
                }
            }
            if(currentSum > biggestSum){
                int i = 0;
                int j = 0;
                for (int row = rowIndex; row < rowIndex + 2; row++) {
                    for (int col = colIndex; col < colIndex + 2; col++) {
                        matrix2x2[i][j] = matrix[row][col];
                        j++;
                    }
                    j=0;
                    i++;
                }
                biggestSum = currentSum;
            }
            counterCols++;
            currentSum = 0;
            if(counterCols == colsCount - 1){
                rowIndex++;
                colIndex = 0;
                counterCols = 0;
                if(rowIndex == rowsCount - 1){
                    break;
                }
            } else {
                colIndex++;
            }
        }
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 2; col++) {
                System.out.print(matrix2x2[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println(biggestSum);
    }
}
