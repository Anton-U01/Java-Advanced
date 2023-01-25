package DefiningClassesLab.carInfo;

public class Car {
        private String brand;
        private String model;
        private int horsepower;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public String carInfo (){
        String result = String.format("The car is: %s %s - %d HP.",brand,model,horsepower);
        return result;
    }
}