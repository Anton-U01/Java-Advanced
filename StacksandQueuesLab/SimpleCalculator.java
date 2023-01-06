package StacksandQueuesLab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque <String> stack = new ArrayDeque<>();
        String line = scan.nextLine();
        String[] data = line.split(" ");
        Collections.addAll(stack,data);
        int result = 0;
        while (stack.size() != 1){
            if(stack.isEmpty()){
                System.out.println(0);
            } else {
                int a = Integer.parseInt(stack.poll());
                String sign = stack.poll();
                int b = Integer.parseInt(stack.poll());
                if(sign.equals("+")){
                    result = a + b;
                } else {
                    result = a - b;
                }
                stack.push(String.valueOf(result));
            }
        }
        System.out.println(result);
    }
}
