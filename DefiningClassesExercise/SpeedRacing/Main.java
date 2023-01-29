package DefiningClassesExercise.SpeedRacing;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String,Car> carMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] data = scan.nextLine().split(" ");
            String model = data[0];
            double fuelAmount = Double.parseDouble(data[1]);
            double fuelPer1Km = Double.parseDouble(data[2]);
            Car car = new Car(model,fuelAmount,fuelPer1Km);
            carMap.put(model,car);
        }
        String line = scan.nextLine();
        while (!line.equals("End")){
            String[] data = line.split(" ");
            String model = data[1];
            int km = Integer.parseInt(data[2]);
            Car currentCar = carMap.get(model);
            if(currentCar.isPossible(km)){
                currentCar.setDistance(currentCar.getDistance() + km);
                currentCar.setFuelAmount(currentCar.getFuelAmount() - currentCar.getFuelPer1Km() * km);
            } else {
                System.out.println("Insufficient fuel for the drive");
            }
            line = scan.nextLine();
        }
        for (Map.Entry<String, Car> entry : carMap.entrySet()) {
            System.out.println(entry.getValue().toString());
        }
    }
}
