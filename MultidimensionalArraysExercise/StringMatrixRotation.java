package MultidimensionalArraysExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String rotation = scan.nextLine().split("[()]")[1];
        int degree = Integer.parseInt(rotation) % 360;
        String line = scan.nextLine();
        ArrayList<String> words = new ArrayList<>();
        int biggestSize = Integer.MIN_VALUE;
        while (!line.equals("END")) {
            int currentSize = line.length();
            if (currentSize > biggestSize) {
                biggestSize = currentSize;
            }
            words.add(line);
            line = scan.nextLine();
        }
        int rows = words.size();
        int cols = biggestSize;
        char[][] matrix = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            String currentWord = words.get(i);
            for (int j = 0; j < cols; j++) {
                if (j < currentWord.length()) {
                    matrix[i][j] = currentWord.charAt(j);
                } else {
                    matrix[i][j] = ' ';
                }
            }
        }
        int angle = degree % 360;
        switch (angle) {
            case 0:
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        System.out.print(matrix[i][j]);
                    }
                    System.out.println();
                }
                break;
            case 90:
                for (int j = 0; j < cols; j++) {
                    for (int i = rows - 1; i >= 0; i--) {
                        System.out.print(matrix[i][j]);
                    }
                    System.out.println();
                }
                break;
            case 180:
                for (int i = rows - 1; i >= 0; i--) {
                    for (int j = cols - 1; j >= 0; j--) {
                        System.out.print(matrix[i][j]);
                    }
                    System.out.println();
                }
                break;
            case 270:
                for (int j = cols - 1; j >= 0; j--) {
                    for (int i = 0; i < rows; i++) {
                        System.out.print(matrix[i][j]);
                    }
                    System.out.println();
                }
                break;

        }
    }
}
