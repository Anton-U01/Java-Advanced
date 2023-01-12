package StakcsAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        StringBuilder text = new StringBuilder();
        ArrayDeque<String> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            String[] line = scan.nextLine().split(" ");
            int command = Integer.parseInt(line[0]);
            switch (command){
                case 1:
                    String textToAppend = line[1];
                    stack.push(text.toString());
                    text.append(textToAppend);
                    break;
                case 2:
                    stack.push(text.toString());
                    int count = Integer.parseInt(line[1]);
                    int startIndex = text.length() - count;
                    text.delete(startIndex,text.length());
                    break;
                case 3:
                    int index = Integer.parseInt(line[1]) - 1;
                    System.out.println(text.charAt(index));
                    break;
                case 4:
                    text = new StringBuilder(stack.pop());
                    break;
            }
        }
    }
}
