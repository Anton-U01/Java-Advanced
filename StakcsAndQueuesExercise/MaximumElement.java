package StakcsAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(int i = 0; i < n; i++){
            String[] data = scan.nextLine().split(" ");
            int element = 0;
            if(data.length != 1){
                element = Integer.parseInt(data[1]);
                stack.push(element);
            } else {
                String command = data[0];
                if(command.equals("2")){
                    if(!stack.isEmpty()){
                        stack.pop();
                    }
                } else {
                    if(!stack.isEmpty()){
                        System.out.println(Collections.max(stack));
                    } else {
                        System.out.println(0);
                    }
                }
            }
        }
    }
}
