package StreamsFilesandDirectoriesExercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class SumLines {
    public static void main(String[] args) throws IOException {
        String input = "D:\\SOFTUNI\\Java-Advanced\\src\\04. Java-Advanced-Streams-Files-and-Directories-Resources (3)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt" ;
        BufferedReader reader = Files.newBufferedReader(Paths.get(input));
        String line = reader.readLine();
        int sumOfLine = 0;
        while (line != null){
            for (int i = 0; i < line.length(); i++) {
                sumOfLine += line.charAt(i);
            }
            System.out.println(sumOfLine);
            sumOfLine = 0;
            line = reader.readLine();
        }
    }
}
