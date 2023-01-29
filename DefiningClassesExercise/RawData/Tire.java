package DefiningClassesExercise.RawData;

public class Tire {
    double tirePressure;
    int tireAge;

    public double getTirePressure() {
        return tirePressure;
    }

    public Tire(double tirePressure, int tireAge) {
        this.tirePressure = tirePressure;
        this.tireAge = tireAge;
    }
}
