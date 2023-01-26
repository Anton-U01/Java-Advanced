package StreamsFilesandDirectoriesLab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) {
        String inPath = "D:\\SOFTUNI\\Java-Advanced\\src\\04. Java-Advanced-Streams-Files-and-Directories-Resources (2)\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outPath = "D:\\SOFTUNI\\Java-Advanced\\src\\04. Java-Advanced-Streams-Files-and-Directories-Resources (2)\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\03.CopyBytesOutput.txt";
        try (FileInputStream fileInputStream = new FileInputStream(inPath)){
            FileOutputStream fileOutputStream = new FileOutputStream(outPath);
            int oneByte = fileInputStream.read();
            while (oneByte >= 0){
                if(oneByte == 32 || oneByte == 10){
                    fileOutputStream.write(oneByte);
                } else {
                    String digits = String.valueOf(oneByte);
                    for (int i = 0; i < digits.length(); i++) {
                        fileOutputStream.write(digits.charAt(i));
                    }
                }
                oneByte = fileInputStream.read();
            }
            fileOutputStream.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
