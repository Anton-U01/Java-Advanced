package StacksandQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        ArrayDeque <String> browsers = new ArrayDeque<>();
        String currentBrowser = "";
        while (!line.equals("Home")){
            if(line.equals("back")){
                if(browsers.size() <= 1){
                    System.out.println("no previous URLs");
                } else {
                    browsers.pop();
                    currentBrowser = browsers.peek();
                    System.out.println(currentBrowser);
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
