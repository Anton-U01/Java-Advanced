package IteratorsandComparatorsExercise.ListyIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListIterator implements Iterator<String> {
    private int index;
    private List<String> list;

    public ListIterator (List<String> list){
        this.list = list;
        if(list.isEmpty()){
            this.index = -1;
        }else {
            this.index = 0;
        }
    }

    @Override
    public boolean hasNext() {
        return index < list.size() - 1;
    }
    @Override
    public String next() {
        return list.get(index++);
    }
    public boolean move(){
        if(index  < list.size() - 1){
            this.index++;
            return true;
        }
        return false;
    }

    public void Print(){
        System.out.println(list.get(index));
    }
}
