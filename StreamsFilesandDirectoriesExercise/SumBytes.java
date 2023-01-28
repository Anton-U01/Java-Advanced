package StreamsFilesandDirectoriesExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SumBytes {
    public static void main(String[] args) throws IOException {
        String input = "D:\\SOFTUNI\\Java-Advanced\\src\\04. Java-Advanced-Streams-Files-and-Directories-Resources (3)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        BufferedReader reader = Files.newBufferedReader(Paths.get(input));
        long sum = 0;
        String line = reader.readLine();
        while (line != null){
            for (int i = 0; i < line.length(); i++) {
                sum += line.charAt(i);
            }
            line = reader.readLine();
        }
        System.out.println(sum);
    }
}
