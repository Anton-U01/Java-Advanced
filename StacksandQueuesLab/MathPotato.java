package StacksandQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] line = scan.nextLine().split(" ");
        ArrayDeque<String> children = new ArrayDeque<>();
        int n = Integer.parseInt(scan.nextLine());
        for (String s : line) {
            children.offer(s);
        }
        int counter = 1;
        while (children.size() != 1){
            String currentChild = "";
            for (int i = 1; i < n; i++) {
                currentChild = children.poll();
                children.offer(currentChild);
            }
            if(isprime(counter)){
                System.out.println("Prime " + children.peek());
            } else {
                System.out.println("Removed " + children.peek());
                children.poll();
            }
            counter++;
        }
        System.out.println("Last is " + children.poll());

    }
    private static boolean isprime(int counter) {
        if(counter == 1){
            return false;
        } else if (counter == 2){
            return true;
        } else if (counter == 3){
            return true;
        }
        boolean flag = true;
        for (int i = 2; i <= counter / 2; i++) {
            if(counter % i == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }
}

