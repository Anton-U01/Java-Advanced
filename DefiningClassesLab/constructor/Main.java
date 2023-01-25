package DefiningClassesLab.constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String line = scan.nextLine();
            String[] data = line.split(" ");
            String brand = data[0];
            Car car = null;
            if (data.length > 1){
                String model = data[1];
                int horsepower = Integer.parseInt(data[2]);
                car = new Car(brand,model,horsepower);
            } else {
                car = new Car(brand);
            }
            cars.add(car);
        }
        for (Car car : cars) {
            System.out.println(car.carInfo());
        }
    }
}
