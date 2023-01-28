package StreamsFilesandDirectoriesExercise;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LineNumbers {
    public static void main(String[] args) throws IOException {
        String input = "D:\\SOFTUNI\\Java-Advanced\\src\\04. Java-Advanced-Streams-Files-and-Directories-Resources (3)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";
        String output = "D:\\SOFTUNI\\Java-Advanced\\src\\04. Java-Advanced-Streams-Files-and-Directories-Resources (3)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output05.txt";
        BufferedReader reader = Files.newBufferedReader(Paths.get(input));
        BufferedWriter writer = Files.newBufferedWriter(Paths.get(output));
        String line = reader.readLine();
        int lineCounter = 1;
        while (line != null){
            writer.write(lineCounter + ". " + line + "\n");
            lineCounter++;
            line = reader.readLine();
        }
        writer.close();
    }
}
