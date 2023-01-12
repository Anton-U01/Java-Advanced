package StakcsAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        boolean balance = true;
        for (int i = 0; i < line.length(); i++) {
            char symbol = line.charAt(i);
            switch (symbol){
                case '{':
                case '[':
                case '(':
                    stack.push(symbol);
                    break;
            }

            switch (symbol){
                case '}':
                    if(!stack.isEmpty() && stack.peek() == '{'){
                        stack.pop();
                    } else {
                        balance = false;
                        break;
                    }
                    break;
                case ']':
                    if(!stack.isEmpty() && stack.peek() == '['){
                        stack.pop();
                    } else{
                        balance = false;
                        break;
                    }
                    break;
                case ')':
                    if(!stack.isEmpty() && stack.peek() == '('){
                        stack.pop();
                    } else{
                        balance = false;
                        break;
                    }
                    break;
            }
            if(!balance){
                break;
            }
        }
        if(!stack.isEmpty()){
            System.out.println("NO");
        } else {
            if(!balance){
                System.out.println("NO");
            }else {
                System.out.println("YES");
            }
        }
    }
}
