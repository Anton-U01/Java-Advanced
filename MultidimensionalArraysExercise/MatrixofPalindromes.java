package MultidimensionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixofPalindromes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] dimension = Arrays.stream(scan.nextLine().split("\\s++")).mapToInt(Integer::parseInt).toArray();
        int rowsCount = dimension[0];
        int colsCount = dimension[1];
        char rowChar = 'a';
        char colChar = 'a';
        String[][] matrix = new String[rowsCount][colsCount];
        for (int row = 0; row < rowsCount; row++) {
            colChar = (char) ('a' + row);
            for (int col = 0; col < colsCount; col++) {
                matrix[row][col] = "" + rowChar + colChar + rowChar;
                colChar++;
            }
            rowChar++;
        }
        printMatrix(matrix,rowsCount,colsCount);
    }
    private static void printMatrix(String[][] matrix, int rowsCount, int colsCount){
        for (int i = 0; i < rowsCount; i++) {
            for (int j = 0; j < colsCount; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
