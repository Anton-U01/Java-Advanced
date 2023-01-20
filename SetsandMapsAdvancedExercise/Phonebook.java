package SetsandMapsAdvancedExercise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        HashMap<String,String> phonebook = new HashMap<>();
        while (!line.equals("search")){
            String[] data = line.split("-");
            String name = data[0];
            String number = data[1];
            phonebook.put(name,number);
            line = scan.nextLine();
        }
        line = scan.nextLine();
        while (!line.equals("stop")){
            if(phonebook.containsKey(line)){
                System.out.println(line + " -> " + phonebook.get(line));
            } else {
                System.out.println("Contact " + line + " does not exist.");
            }

            line = scan.nextLine();
        }
    }
}
