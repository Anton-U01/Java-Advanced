package GenericsExercise.GenericCountMethodStrings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Box box = new Box();
        for (int i = 0; i < n; i++) {
            double line = Double.parseDouble(scan.nextLine());
            box.add(line);
        }
        double element = Double.parseDouble(scan.nextLine());
        System.out.println(box.getCount(element));
    }
}