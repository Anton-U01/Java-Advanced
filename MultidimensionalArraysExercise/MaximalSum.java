package MultidimensionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] dimension = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = dimension[0];
        int cols = dimension[1];
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            int[] line = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = line;
        }
        int biggestSum = 0;
        int currentSum = 0;
        int rowsCounter = 0;
        int colsCounter = 0;
        int[][] topMatrix = new int[3][3];
        while (true){
            for (int i = rowsCounter; i < rowsCounter + 3; i++) {
                for (int j = colsCounter; j < colsCounter + 3; j++) {
                    currentSum += matrix[i][j];
                }
            }
            if(currentSum > biggestSum){
                biggestSum = currentSum;
                int row = 0;
                int col = 0;
                for (int i = rowsCounter; i < rowsCounter + 3; i++) {
                    for (int j = colsCounter; j < colsCounter + 3; j++) {
                        topMatrix[row][col] = matrix[i][j];
                        col++;
                    }
                    col = 0;
                    row++;
                }
            }
            currentSum = 0;
            colsCounter++;
            if(colsCounter == cols - 2){
                rowsCounter++;
                colsCounter = 0;
            }
            if(rowsCounter == rows - 2){
                break;
            }
        }
        System.out.println("Sum = " + biggestSum);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(topMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
