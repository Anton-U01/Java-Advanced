package MultidimensionalArraysLab;

import java.util.Scanner;

public class PrintDiagonalsofSquareMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String[][] matrix = new String[n][n];
        for (int row = 0; row < n; row++) {
            String[] line = scan.nextLine().split("\\s++");
            for (int col = 0; col < n; col++) {
                matrix[row][col] = line[col];
            }
        }
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if(col == row){
                    System.out.print(matrix[row][col] + " ");
                }
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[n - 1 - i][i] + " ");
        }
    }
}
