package GenericsExercise.GenericCountMethodStrings;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable>{
    private List<T> elements;

    public Box(){
        this.elements = new ArrayList<>();
    }
    public Box(T something) {
        this.elements = new ArrayList<>();
    }

    public void add(T element){
        this.elements.add(element);
    }

    public int getCount(T element){
        int count = 0;
        for (T memberInList : elements) {
            if(memberInList.compareTo(element) > 0){
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString(){
        return elements.getClass().getName() + ": " + elements;
    }
}
