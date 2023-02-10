package IteratorsandComparatorsExercise.StackIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        Stack stack = new Stack();
        while (!line.equals("END")){
            String[] data = line.split(" ");
            switch (data[0]){
                case "Push":
                    List<Integer> integers =new ArrayList<>();
                    StringBuilder builder = new StringBuilder();
                    for (int i = 1; i < data.length; i++) {
                        builder.append(data[i]);
                        integers.add(Integer.parseInt(String.valueOf(builder.charAt(0))));
                        builder.setLength(0);
                    }
                    stack.push(integers);
                    break;

                case "Pop":
                    stack.pop();
                    break;
            }
            line = scan.nextLine();
        }
        for (int i = stack.size() - 1; i >=0; i--) {
            System.out.println(stack.get(i));
        }
        for (int i = stack.size() - 1; i >=0; i--) {
            System.out.println(stack.get(i));
        }
    }
}
