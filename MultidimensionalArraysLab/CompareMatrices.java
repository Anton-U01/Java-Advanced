package MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] sizeOfFirst = scan.nextLine().split(" ");
        int row1 = Integer.parseInt(sizeOfFirst[0]);
        int col1 = Integer.parseInt(sizeOfFirst[1]);
        String[][] matrix1 = new String[row1][col1];
        for (int row = 0; row < row1; row++) {
            String[] rowOfMatrix = scan.nextLine().split(" ");
            for (int col = 0; col < col1; col++) {
                matrix1[row][col] = rowOfMatrix[col];
            }
        }
        String[] sizeOfSecond = scan.nextLine().split(" ");
        int row2 = Integer.parseInt(sizeOfSecond[0]);
        int col2 = Integer.parseInt(sizeOfSecond[1]);
        if(row2 != row1 || col2 != col1){
            System.out.println("not equal");
            return;
        }
        String[][] matrix2 = new String[row2][col2];
        for (int row = 0; row < row2; row++) {
            String[] rowOfMatrix = scan.nextLine().split(" ");
            for (int col = 0; col < col2; col++) {
                matrix2[row][col] = rowOfMatrix[col];
            }
        }
        for (int row = 0; row < row1; row++) {
            for (int col = 0; col < col1; col++) {
                if(!matrix1[row][col].equals(matrix2[row][col])){
                    System.out.println("not equal");
                    return;
                }
            }
        }
        System.out.println("equal");
    }
}
