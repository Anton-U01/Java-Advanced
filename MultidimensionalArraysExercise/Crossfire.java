package MultidimensionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class Crossfire {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] dimension = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = dimension[0];
        int cols = dimension[1];
        String[][] matrix = new String[rows][cols];
        int filler = 1;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = String.valueOf(filler++);
            }
        }
        String line = scan.nextLine();
        while (line.equals("Nuke it from orbit")){
            String[] data = scan.nextLine().split(" ");
            int row = Integer.parseInt(data[0]);
            int col = Integer.parseInt(data[1]);
            int radius = Integer.parseInt(data[2]);
            for (int i = row - radius; i < rows; i++) {
                if(i == row){
                    if(col - radius <= 0){

                    }
                } else {
                    if(col == cols - 1){
                        matrix[i][col] = "";
                    }
                    matrix[i][col] = matrix[i][col++];
                }
            }
            line = scan.nextLine();
        }
    }
}
