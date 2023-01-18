package SetsandMapsAdvancedLab;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<Double,Integer> occurrences = new LinkedHashMap<>();
        double[] line = Arrays.stream(scan.nextLine().split("\\s++"))
                .mapToDouble(Double::parseDouble)
                .toArray();
        for (int i = 0; i < line.length; i++) {
            if(occurrences.containsKey(line[i])){
                int count = occurrences.get(line[i]);
                occurrences.put(line[i],++count);
            } else {
                occurrences.put(line[i],1);
            }
        }
        for (Map.Entry<Double, Integer> entry : occurrences.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
