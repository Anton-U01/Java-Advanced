package GenericsExercise.GenericBox;

import GenericsExercise.GenericBox.Box;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            int line = Integer.parseInt(scan.nextLine());
            Box box = new Box<>(line);
            System.out.println(box.toString());
        }

    }
}
