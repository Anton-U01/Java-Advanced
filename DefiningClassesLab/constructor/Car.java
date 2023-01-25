package DefiningClassesLab.constructor;

public class Car {

    private String brand;
    private String model;
    private int horsepower;
    public Car (String brand){
        this.brand = brand;
        this.model = "unknown";
        this.horsepower = -1;
    }
    public Car(String brand, String model, int horsepower){
        this(brand);
        this.model = model;
        this.horsepower = horsepower;
    }
    public String carInfo (){
        String result = String.format("The car is: %s %s - %d HP.",brand,model,horsepower);
        return result;
    }

}
