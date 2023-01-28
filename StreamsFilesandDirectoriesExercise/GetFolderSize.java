package StreamsFilesandDirectoriesExercise;

import java.io.File;
import java.nio.file.Files;

public class GetFolderSize {
    public static void main(String[] args) {
        String path = "D:\\SOFTUNI\\Java-Advanced\\src\\04. Java-Advanced-Streams-Files-and-Directories-Resources (3)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";
        File folder = new File(path);
        File[] allFiles = folder.listFiles();
        int folderSize = 0;
        for (File file : allFiles) {
            folderSize += file.length();
        }
        System.out.println("Folder size: " + folderSize);
    }
}
