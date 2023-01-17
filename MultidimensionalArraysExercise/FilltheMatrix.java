package MultidimensionalArraysExercise;

import java.util.Scanner;

public class FilltheMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] line = scan.nextLine().split(", ");
        int size = Integer.parseInt(line[0]);
        String type = line[1];
        String[][] matrix = new String[size][size];
        if (type.equals("A")) {
            matrix = fillLeftToRight(size);
        } else {
            matrix = fillTopToBottom(size);
        }
        printMatrix(matrix, size);
    }

    private static void printMatrix(String[][] matrix, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static String[][] fillLeftToRight(int size) {
        String[][] matrix = new String[size][size];
        int numberToInsert = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[j][i] = String.valueOf(++numberToInsert);
            }
        }
        return matrix;
    }

    private static String[][] fillTopToBottom(int size) {
        String[][] matrix = new String[size][size];
        int counter = 0;
        int numberToInsert = 0;
        while (counter != size) {
            if (counter % 2 == 0){
                for (int j = 0; j < size; j++) {
                    matrix[j][counter] = String.valueOf(++numberToInsert);
                }
            }else {
                for (int j = size - 1; j >= 0; j--) {
                    matrix[j][counter] = String.valueOf(++numberToInsert);
                }
            }
            counter++;
        }

        return matrix;
    }
}
