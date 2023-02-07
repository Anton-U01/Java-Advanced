package GenericsExercise.GenericBox;

public class Box <T>{
    private T something;

    public Box(T something) {
        this.something = something;
    }

    @Override
    public String toString(){
        return something.getClass().getName() + ": " + something;
    }
}
