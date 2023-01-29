package DefiningClassesExercise.CarSalesman;

public class Car {
    private String model;
    private Engine engine;
    //optional
    private int weight;
    private String color = "n/a";

    public Engine getEngine() {
        return engine;
    }

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public Car(String model, Engine engine, int weight) {
        this(model,engine);
        this.weight = weight;
    }

    public Car(String model, Engine engine, int weight, String color) {
        this(model,engine,weight);
        this.color = color;
    }
    public Car(String model,Engine engine,String color){
        this(model,engine);
        this.color = color;
    }
    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
