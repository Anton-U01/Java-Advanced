package MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] sizeOfMatrix = Arrays.stream(scan.nextLine().split("\\s++"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rowsCount = sizeOfMatrix[0];
        int colsCount = sizeOfMatrix[1];
        int[][] matrix = new int[rowsCount][colsCount];
        for (int row = 0; row < rowsCount; row++) {
            String[] line = scan.nextLine().split("\\s++");
            for (int col = 0; col < colsCount; col++) {
                matrix[row][col] = Integer.parseInt(line[col]);
            }
        }
        boolean isFound = false;
        int number = Integer.parseInt(scan.nextLine());
        for (int row = 0; row < rowsCount; row++) {
            for (int col = 0; col < colsCount; col++) {
                if(matrix[row][col] == number){
                    System.out.println(row + " " + col);
                    isFound = true;
                }
            }
        }
        if(!isFound){
            System.out.println("not found");
        }
    }
}
