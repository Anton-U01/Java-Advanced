package StreamsFilesandDirectoriesLab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WritetoFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        String inPath = "D:\\SOFTUNI\\Java-Advanced\\src\\04. Java-Advanced-Streams-Files-and-Directories-Resources (2)\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outPath = "D:\\SOFTUNI\\Java-Advanced\\src\\04. Java-Advanced-Streams-Files-and-Directories-Resources (2)\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\02.WriteToFileOutput.txt";
        List<Character> punctuation = Arrays.asList(',', '.', '!', '?');
        try (FileInputStream fileStream = new FileInputStream (inPath)) {
            FileOutputStream fileOutputStream = new FileOutputStream(outPath);
            int oneByte = fileStream.read();
            while (oneByte >= 0){
                if(!punctuation.contains((char)oneByte)){
                    fileOutputStream.write((char)oneByte);
                }
                oneByte = fileStream.read();
            }
        }catch(IOException e){
          e.printStackTrace();
        }
    }
}
