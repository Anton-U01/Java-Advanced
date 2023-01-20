package SetsandMapsAdvancedExercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeMap<Character,Integer> occurrences = new TreeMap<>();
        String line = scan.nextLine();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if(occurrences.containsKey(c)){
                int count = occurrences.get(c);
                occurrences.put(c,++count);
            } else {
                occurrences.put(c,1);
            }
        }
        for (Map.Entry<Character, Integer> characterIntegerEntry : occurrences.entrySet()) {
            System.out.println(characterIntegerEntry.getKey() + ": " + characterIntegerEntry.getValue() + " time/s");
        }
    }
}
