package StacksandQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque <Integer> stack = new ArrayDeque<>();
        String line = scan.nextLine();
        for(int i = 0; i < line.length(); i++){
            char symbol = line.charAt(i);
            if(symbol == '('){
                stack.push(i);
            } else if (symbol == ')'){
                int startIndex = stack.pop();
                String part = line.substring(startIndex,i + 1);
                System.out.println(part);
            }
        }
    }
}
