package StreamsFilesandDirectoriesLab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

import static java.lang.System.out;

public class ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {
        String inPath = "D:\\SOFTUNI\\Java-Advanced\\src\\04. Java-Advanced-Streams-Files-and-Directories-Resources (2)\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        Scanner scanner = new Scanner(new FileInputStream(inPath));
        while (scanner.hasNext()){
            if(scanner.hasNextInt()){
                out.println(scanner.nextInt());
            }
            scanner.next();
        }
    }
}
