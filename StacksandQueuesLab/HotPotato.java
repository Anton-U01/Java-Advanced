package StacksandQueuesLab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] line = scan.nextLine().split(" ");
        ArrayDeque <String> children = new ArrayDeque<>();
        int n = Integer.parseInt(scan.nextLine());
        for (String s : line) {
            children.offer(s);
        }
        while (children.size() != 1){
            String currentChild = "";
            for (int i = 1; i < n; i++) {
                currentChild = children.poll();
                children.offer(currentChild);
            }
            System.out.println("Removed " + children.peek());
            children.poll();
        }
        System.out.println("Last is " + children.poll());
    }
}
