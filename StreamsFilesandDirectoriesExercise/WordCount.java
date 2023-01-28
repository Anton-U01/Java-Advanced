package StreamsFilesandDirectoriesExercise;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Struct;
import java.util.*;

public class WordCount {
    public static void main(String[] args) throws IOException {
        String words = "D:\\SOFTUNI\\Java-Advanced\\src\\04. Java-Advanced-Streams-Files-and-Directories-Resources (3)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";
        String text = "D:\\SOFTUNI\\Java-Advanced\\src\\04. Java-Advanced-Streams-Files-and-Directories-Resources (3)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt";
        String output = "D:\\SOFTUNI\\Java-Advanced\\src\\04. Java-Advanced-Streams-Files-and-Directories-Resources (3)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\results.txt";
        Map<String,Integer> counting = new HashMap<>();
        List<String> allLinesWords = Files.readAllLines(Path.of(words));
        for (String linesWord : allLinesWords) {
            Arrays.stream(linesWord.split("\\s++")).forEach(
                    word -> {
                        counting.put(word,0);
                    }
            );
        }
        List<String> allLines = Files.readAllLines(Path.of(text));
        for (String line : allLines) {
            Arrays.stream(line.split("\\s++")).forEach(word ->{
                if(counting.containsKey(word)){
                    counting.put(word,counting.get(word) + 1);
                }
            });
        }
        PrintWriter writer = new PrintWriter(output);
        counting.entrySet().stream().sorted((e1,e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(entry -> writer.println(entry.getKey() + " - " + entry.getValue()));
        writer.close();
    }
}
