package MultidimensionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;


public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] dimension = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = dimension[0];
        int cols = dimension[1];
        String[][] matrix = new String[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] line = scan.nextLine().split("\\s++");
            matrix[row] = line;
        }
        String line = scan.nextLine();
        while (!line.equals("END")) {
            String[] data = line.split(" ");
            String command = data[0];
            if (data.length == 5) {
                if (command.equals("swap")) {
                    int row1 = Integer.parseInt(data[1]);
                    int col1 = Integer.parseInt(data[2]);
                    int row2 = Integer.parseInt(data[3]);
                    int col2 = Integer.parseInt(data[4]);
                    if (!isValid(rows, cols, row1, col1, row2, col2)){
                        System.out.println("Invalid input!");
                    }else{
                        String currentChange = matrix[row1][col1];
                        matrix[row1][col1] = matrix[row2][col2];
                        matrix[row2][col2] = currentChange;
                        for (int i = 0; i < rows; i++) {
                            for (int j = 0; j < cols; j++) {
                                System.out.print(matrix[i][j] + " ");
                            }
                            System.out.println();
                        }
                    }
                }
            } else {
                System.out.println("Invalid input!");
            }
            line = scan.nextLine();
        }

    }
    private static boolean isValid ( int rows, int cols, int row1, int col1, int row2, int col2){
        if (row1 < 0 || row1 >= rows) {
            return false;
        } else if (row2 < 0 || row2 >= rows) {
            return false;
        } else if (col1 < 0 || col1 >= cols) {
            return false;
        } else if (col2 < 0 || col2 >= cols) {
            return false;
        } else {
            return true;
        }
    }
}
