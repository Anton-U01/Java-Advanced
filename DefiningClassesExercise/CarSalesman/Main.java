package DefiningClassesExercise.CarSalesman;

import DefiningClassesExercise.CarSalesman.Car;
import DefiningClassesExercise.CarSalesman.Engine;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String, Engine> enginesList = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] engineData = scan.nextLine().split(" ");
            String model = engineData[0];
            int power = Integer.parseInt(engineData[1]);
            Engine engine = null;
            if(engineData.length == 2){
                engine = new Engine(model,power);
            } else if (engineData.length == 3){
                if(Character.isDigit(engineData[2].charAt(0))){
                    int displacement = Integer.parseInt(engineData[2]);
                    engine = new Engine(model,power,displacement);
                } else {
                    String efficiency = engineData[2];
                    engine = new Engine(model,power,efficiency);
                }
            } else {
                int displacement = Integer.parseInt(engineData[2]);
                String efficiency = engineData[3];
                engine = new Engine(model,power,displacement,efficiency);
            }
            enginesList.put(model,engine);
        }
        int m = Integer.parseInt(scan.nextLine());
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String[] carData = scan.nextLine().split(" ");
            String model = carData[0];
            String engineModel = carData[1];
            Engine currentCarEngine = enginesList.get(engineModel);
            Car car = null;
            if(carData.length == 2){
                car = new Car(model,currentCarEngine);
            } else if(carData.length == 3){
                if(Character.isDigit(carData[0].charAt(0))){
                    int weight = Integer.parseInt(carData[2]);
                    car = new Car(model,currentCarEngine,weight);
                } else {
                    String color = carData[2];
                    car = new Car(model,currentCarEngine,color);
                }

            } else {
                int weight = Integer.parseInt(carData[2]);
                String color = carData[3];
                car = new Car(model,currentCarEngine,weight,color);
            }
            cars.add(car);
        }
        for (Car car : cars) {
            System.out.println(car.getModel() + ":");
            System.out.println(car.getEngine().getModel() + ":");
            System.out.println("Power: " + car.getEngine().getPower());
            if(car.getEngine().getDisplacement() == 0){
                System.out.println("Displacement: n/a");
            }else {
                System.out.println("Displacement: " + car.getEngine().getDisplacement());
            }
            if(car.getEngine().getEfficiency() == null){
                System.out.println("Efficiency: n/a");
            }else {
                System.out.println("Efficiency: " + car.getEngine().getEfficiency());
            }
            if(car.getWeight() == 0){
                System.out.println("Weight: n/a");
            }else {
                System.out.println("Weight: " + car.getWeight());
            }
            if(car.getColor() == null){
                System.out.println("Color: n/a");
            }else {
                System.out.println("Color: " + car.getColor());
            }
        }
    }
}
