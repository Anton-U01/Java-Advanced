package DefiningClassesLab.carInfo;

import DefiningClassesLab.carInfo.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Car> carsList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Car car = new Car();
            String[] data = scan.nextLine().split(" ");
            String brand = data[0];
            String model = data[1];
            int horsepower = Integer.parseInt(data[2]);
            car.setBrand(brand);
            car.setModel(model);
            car.setHorsepower(horsepower);
            carsList.add(car);
        }
        for (Car car : carsList) {
            System.out.println(car.carInfo());
        }
    }
}
