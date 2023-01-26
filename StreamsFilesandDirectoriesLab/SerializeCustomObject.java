package StreamsFilesandDirectoriesLab;

import java.io.*;

public class SerializeCustomObject {
    public static void main(String[] args) throws FileNotFoundException {
        class Cube implements Serializable{
            String color;
            double width;
            double height;
            double depth;
        }
        Cube cube = new Cube();
        cube.color = "green";
        cube.width = 15.3d;
        cube.height = 12.4d;
        cube.depth = 3d;
        String path = "D:\\SOFTUNI\\Java-Advanced\\src\\04. Java-Advanced-Streams-Files-and-Directories-Resources (2)\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams\\Serialization\\output.txt";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))){
            oos.writeObject(cube);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
