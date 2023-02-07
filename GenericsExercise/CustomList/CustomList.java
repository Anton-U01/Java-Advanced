package GenericsExercise.CustomList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList<T extends Comparable> {
    private List<T> list;

    public CustomList() {
        this.list = new ArrayList<>();
    }

    void add(T element){
        this.list.add(element);
    }
    T remove(int index){
        T removedElement = list.get(index);
        this.list.remove(index);
        return removedElement;
    }

    boolean contains(T element){
        return list.contains(element);
    }

    void swap (int index1,int index2){
        T e1 = list.get(index1);
        T e2 = list.get(index2);
        list.set(index1,e2);
        list.set(index2,e1);
    }

    int countGreaterThan (T element){
        int count = 0;
        for (T member : list) {
            if(member.compareTo(element) > 0){
                count++;
            }
        }
        return count;
    }
    T getMax(){
        T maxElement = list.get(0);
        for (T element : list) {
            if(element.compareTo(maxElement) > 0){
                maxElement = element;
            }
        }
        return maxElement;
    }
    T getMin(){
        T minElement = list.get(0);
        for (T element : list) {
            if(element.compareTo(minElement) < 0){
                minElement = element;
            }
        }
        return minElement;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        for (T t : list) {
            builder.append(t + "\n");
        }
        return builder.toString();
    }


}
