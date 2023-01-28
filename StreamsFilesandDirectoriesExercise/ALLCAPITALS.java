package StreamsFilesandDirectoriesExercise;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ALLCAPITALS {
    public static void main(String[] args) throws IOException {
        String input = "D:\\SOFTUNI\\Java-Advanced\\src\\04. Java-Advanced-Streams-Files-and-Directories-Resources (3)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String outputPath = "D:\\SOFTUNI\\Java-Advanced\\src\\04. Java-Advanced-Streams-Files-and-Directories-Resources (3)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\outputCapitals.txt";
        BufferedWriter output = Files.newBufferedWriter(Paths.get(outputPath));
        List<String> lines = Files.readAllLines(Path.of(input));
        for (String line : lines) {
            output.write(line.toUpperCase());
            output.newLine();
        }
        output.close();
    }
}
