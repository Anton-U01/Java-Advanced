package StacksandQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        ArrayDeque<String> browsers = new ArrayDeque<>();
        ArrayDeque<String> nextBrowsers = new ArrayDeque<>();
        String currentBrowser = "";
        while (!line.equals("Home")) {
            if (line.equals("back")) {
                if (browsers.size() <= 1) {
                    System.out.println("no previous URLs");
                } else {
                    browsers.pop();
                    nextBrowsers.push(currentBrowser);
                    currentBrowser = browsers.peek();
                    System.out.println(currentBrowser);
                }
            } else if (line.equals("forward")) {
                if (!nextBrowsers.isEmpty()) {
                    browsers.push(nextBrowsers.peek());
                    System.out.println(nextBrowsers.pop());
                } else {
                    System.out.println("no next URLs");
                }
            } else {
                browsers.push(line);
                currentBrowser = browsers.peek();
                System.out.println(currentBrowser);
            }

            line = scan.nextLine();
        }
    }
}
