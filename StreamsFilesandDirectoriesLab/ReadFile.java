package StreamsFilesandDirectoriesLab;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        String path = "D:\\SOFTUNI\\Java-Advanced\\src\\04. Java-Advanced-Streams-Files-and-Directories-Resources (2)\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        try (FileInputStream fileStream = new FileInputStream(path)){
            int oneByte = fileStream.read();
            while (oneByte >= 0){
                System.out.printf("%s ",Integer.toBinaryString(oneByte));
                oneByte = fileStream.read();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
