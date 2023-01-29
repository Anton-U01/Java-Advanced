package DefiningClassesExercise.RawData;

public class Cargo {
    int cargoWeight;
    String cargoType;

    public String getCargoType() {
        return cargoType;
    }

    public Cargo(int cargoWeight, String cargoType) {
        this.cargoWeight = cargoWeight;
        this.cargoType = cargoType;
    }
}
