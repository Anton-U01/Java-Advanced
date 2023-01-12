package StakcsAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int N = scan.nextInt();
        int S = scan.nextInt();
        int X = scan.nextInt();
        for(int i = 0; i < N; i++){
            int number = scan.nextInt();
            stack.push(number);
        }
        for(int i = 0; i < S; i++){
            stack.pop();
        }
        if(!stack.isEmpty()){
            if(stack.contains(X)){
                System.out.println(true);
            } else {
                System.out.println(Collections.min(stack));
            }
        } else {
            System.out.println(0);
        }

    }
}
