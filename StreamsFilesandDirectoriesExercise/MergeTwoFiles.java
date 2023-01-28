package StreamsFilesandDirectoriesExercise;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MergeTwoFiles {
    public static void main(String[] args) throws IOException {
        String file1 = "D:\\SOFTUNI\\Java-Advanced\\src\\04. Java-Advanced-Streams-Files-and-Directories-Resources (3)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";
        String file2 = "D:\\SOFTUNI\\Java-Advanced\\src\\04. Java-Advanced-Streams-Files-and-Directories-Resources (3)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";
        List<String> list1 = Files.readAllLines(Path.of(file1));
        PrintWriter writer = new PrintWriter("D:\\SOFTUNI\\Java-Advanced\\src\\04. Java-Advanced-Streams-Files-and-Directories-Resources (3)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\results.txt");
        list1.forEach(line -> writer.println(line));
        List<String> list2 = Files.readAllLines(Path.of(file2));
        list2.forEach(line -> writer.println(line));
        writer.close();
    }
}
