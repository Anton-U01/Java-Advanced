package GenericsExercise.CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        CustomList<String> customList = new CustomList<>();
        while (!line.equals("END")){
            String[] data = line.split(" ");
            String command = data[0];
            switch (command){
                case "Add":
                    customList.add(data[1]);
                    break;
                case "Remove":
                    customList.remove(Integer.parseInt(data[1]));
                    break;
                case "Contains":
                    System.out.println(customList.contains(data[1]));
                    break;
                case "Swap":
                    customList.swap(Integer.parseInt(data[1]),Integer.parseInt(data[2]));
                    break;
                case "Greater":
                    System.out.println(customList.countGreaterThan(data[1]));
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Print":
                    System.out.println(customList.toString());
                    break;
            }
            line = scan.nextLine();
        }
    }
}
