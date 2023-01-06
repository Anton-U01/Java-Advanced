package StacksandQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque <String> queue = new ArrayDeque<>();
        String line = scan.nextLine();
        while (!line.equals("print")){
            if(line.equals("cancel")){
                if(queue.isEmpty()){
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + queue.peek());
                    queue.pop();
                }
            } else {
                queue.offer(line);
            }
            line = scan.nextLine();
        }
        for (String s : queue) {
            System.out.println(s);
        }
    }
}
