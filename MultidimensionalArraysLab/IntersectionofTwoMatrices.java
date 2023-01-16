package MultidimensionalArraysLab;

import java.util.Scanner;

public class IntersectionofTwoMatrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rowsCount = Integer.parseInt(scan.nextLine());
        int colsCount = Integer.parseInt(scan.nextLine());
        char[][] matrix1 = new char[rowsCount][colsCount];
        for (int row = 0; row < rowsCount; row++) {
            String[] line = scan.nextLine().split("\\s++");
            for (int col = 0; col < colsCount; col++) {
                matrix1[row][col] = line[col].charAt(0);
            }
        }
        char[][] matrix2 = new char[rowsCount][colsCount];
        for (int row = 0; row < rowsCount; row++) {
            String[] line = scan.nextLine().split("\\s++");
            for (int col = 0; col < colsCount; col++) {
                matrix2[row][col] = line[col].charAt(0);
            }
        }
        for (int row = 0; row < rowsCount; row++) {
            for (int col = 0; col < colsCount; col++) {
                if(matrix1[row][col] == matrix2[row][col]){
                    System.out.print(matrix1[row][col] + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
