package SetsandMapsAdvancedLab;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        HashSet<String> cars = new LinkedHashSet<>();
        while (!line.equals("END")){
            String[] data = line.split(", ");
            String command = data[0];
            String carNumber = data[1];
            if(command.equals("IN")){
                cars.add(carNumber);
            } else {
                cars.remove(carNumber);
            }
            line = scan.nextLine();
        }
        if(cars.isEmpty()){
            System.out.println("Parking Lot is Empty");
        } else {
            for (String car : cars) {
                System.out.println(car);
            }
        }
    }
}
