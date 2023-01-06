package StacksandQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimaltoBinaryConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int decimal = Integer.parseInt(scan.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        if(decimal == 0){
            System.out.println(0);
        } else {
            while (decimal != 0){
                if(decimal % 2 == 0){
                    stack.push(0);
                } else {
                    stack.push(1);
                }
                decimal = decimal / 2;
            }
        }
        for (Integer integer : stack) {
            System.out.print(integer);
        }
    }
}
