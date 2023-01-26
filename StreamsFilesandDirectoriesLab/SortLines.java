package StreamsFilesandDirectoriesLab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortLines {
    public static void main(String[] args) throws IOException {
        String inPath = "D:\\SOFTUNI\\Java-Advanced\\src\\04. Java-Advanced-Streams-Files-and-Directories-Resources (2)\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outPath = "D:\\SOFTUNI\\Java-Advanced\\src\\04. Java-Advanced-Streams-Files-and-Directories-Resources (2)\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\06.SortLinesOutput.txt";
        Path input = Paths.get(inPath);
        Path output = Paths.get(outPath);
        List<String> lines = Files.readAllLines(input);
        Collections.sort(lines);
        Files.write(output,lines);

    }
}
