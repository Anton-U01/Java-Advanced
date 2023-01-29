package DefiningClassesExercise.SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelPer1Km;
    private int distance = 0;

    public Car(String model, double fuelAmount, double fuelPer1Km) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelPer1Km = fuelPer1Km;
    }

    public boolean isPossible(int km) {
        double neededFuel = km * fuelPer1Km;
        if(fuelAmount >= neededFuel){
            return true;
        }
        return false;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public double getFuelPer1Km() {
        return fuelPer1Km;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    @Override
    public String toString(){
        return model + " " + String.format("%.2f",fuelAmount) + " " + distance;
    }
}
