package StreamsFilesandDirectoriesLab;

import java.io.*;
import java.util.Scanner;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {
        String path = "D:\\SOFTUNI\\Java-Advanced\\src\\04. Java-Advanced-Streams-Files-and-Directories-Resources (2)\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outPath = "D:\\SOFTUNI\\Java-Advanced\\src\\04. Java-Advanced-Streams-Files-and-Directories-Resources (2)\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\05.WriteEveryThirdLineOutput.txt";
        BufferedReader in = new BufferedReader(new FileReader(path));
        PrintWriter out = new PrintWriter(new FileWriter(outPath));
        Scanner scan = new Scanner(in);
        int counter = 1;
        String line = scan.nextLine();
        while (scan.hasNextLine()) {
            if (counter % 3 == 0) {
                out.println(line);
            }
            counter++;
            line = scan.nextLine();
        }
        out.close();
    }
}

