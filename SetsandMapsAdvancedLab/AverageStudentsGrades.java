package SetsandMapsAdvancedLab;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, ArrayList<Double>> students = new TreeMap<>();
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String[] data = scan.nextLine().split(" ");
            String name = data[0];
            double grade = Double.parseDouble(data[1]);
            if(students.containsKey(name)){
                students.get(name).add(grade);
            } else {
                students.put(name,new ArrayList<>());
                students.get(name).add(grade);
            }
        }
        for (Map.Entry<String, ArrayList<Double>> entry : students.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            entry.getValue().forEach(s ->  System.out.printf("%.2f ",s));
            double avg = entry.getValue().stream().mapToDouble(a -> a).average().orElse(0);
            System.out.printf("(avg: %.2f)",avg);
            System.out.println();
        }
    }
}
