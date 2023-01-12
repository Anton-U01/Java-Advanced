package StakcsAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumberswithaStack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<Character> stack = new ArrayDeque<>();
        String line = scan.nextLine();
        for(int i = 0; i < line.length(); i++){
            stack.push(line.charAt(i));
        }
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            System.out.print(stack.pop());
        }
    }
}
