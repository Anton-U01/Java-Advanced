package DefiningClassesExercise.RawData;

import DefiningClassesExercise.RawData.Car;
import DefiningClassesExercise.RawData.Cargo;
import DefiningClassesExercise.RawData.Engine;
import DefiningClassesExercise.RawData.Tire;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Car> cars = new ArrayList<>();
        Car car = null;
        for (int i = 0; i < n; i++) {
            String[] data = scan.nextLine().split(" ");
            String model = data[0];
            int engineSpeed = Integer.parseInt(data[1]);
            int enginePower = Integer.parseInt(data[2]);
            Engine engine = new Engine(engineSpeed,enginePower);
            int cargoWeight = Integer.parseInt(data[3]);
            String cargoType = data[4];
            Cargo cargo = new Cargo(cargoWeight,cargoType);
            List<Tire> tires = new ArrayList<>();
            Tire tire = null;
            double tire1Pressure = Double.parseDouble(data[5]);
            int tyre1Age = Integer.parseInt(data[6]);
            tire = new Tire(tire1Pressure,tyre1Age);
            tires.add(tire);
            double tire2Pressure = Double.parseDouble(data[7]);
            int tire2Age = Integer.parseInt(data[8]);
            tire = new Tire(tire2Pressure,tire2Age);
            tires.add(tire);
            double tire3Pressure = Double.parseDouble(data[9]);
            int tire3Age = Integer.parseInt(data[10]);
            tire = new Tire(tire3Pressure,tire3Age);
            tires.add(tire);
            double tire4Pressure = Double.parseDouble(data[11]);
            int tire4Age = Integer.parseInt(data[12]);
            tire = new Tire(tire4Pressure,tire4Age);
            tires.add(tire);
            car = new Car(model,engine,cargo,tires);
            cars.add(car);
        }
        String line = scan.nextLine();
        if(line.equals("fragile")){
            for (Car car1 : cars) {
                if(car1.cargo.getCargoType().equals(line)){
                    for (Tire tire : car1.tires) {
                        if(tire.getTirePressure() < 1){
                            System.out.println(car1.getModel());
                            break;
                        }
                    }
                }
            }
        } else if (line.equals("flamable")){
            for (Car car1 : cars) {
                if(car1.cargo.getCargoType().equals(line)){
                    for (Tire tire : car1.tires) {
                        if(car1.engine.getEnginePower() > 250){
                            System.out.println(car1.getModel());
                            break;
                        }
                    }
                }
            }
        }
    }
}
