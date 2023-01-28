package StreamsFilesandDirectoriesExercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountCharacterTypes {
    public static void main(String[] args) throws IOException {
        String inputPath = "D:\\SOFTUNI\\Java-Advanced\\src\\04. Java-Advanced-Streams-Files-and-Directories-Resources (3)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String outputPath = "D:\\SOFTUNI\\Java-Advanced\\src\\04. Java-Advanced-Streams-Files-and-Directories-Resources (3)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\outputCapitals.txt";
        BufferedReader reader = Files.newBufferedReader(Paths.get(inputPath));
        BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputPath));
        int vowelsCount = 0;
        int otherSymbolsCount = 0;
        int punctuationCount = 0;
        String line = reader.readLine();
        while (line != null){
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                    vowelsCount++;
                } else if (c == '!' || c == ',' || c == '.' || c == '?'){
                    punctuationCount++;
                } else {
                    if(c != 32){
                        otherSymbolsCount++;
                    }
                }
            }
            line = reader.readLine();
        }
        writer.write("Vowels: " + vowelsCount + "\n");
        writer.write("Other symbols: " + otherSymbolsCount + "\n");
        writer.write("Punctuation: " + punctuationCount);
        writer.close();
    }
}
