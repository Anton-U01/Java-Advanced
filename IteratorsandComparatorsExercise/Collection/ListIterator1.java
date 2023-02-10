package IteratorsandComparatorsExercise.Collection;

import java.util.Iterator;
import java.util.List;

public class ListIterator1 implements Iterable<String> {
    private int index;
    private List<String> list;

    public ListIterator1(List<String> list){
        this.list = list;
        if(list.isEmpty()){
            this.index = -1;
        }else {
            this.index = 0;
        }
    }

    public boolean hasNext() {
        return this.index < list.size() - 1;
    }

    public boolean move(){
        if(this.index < list.size() - 1){
            this.index++;
            return true;
        }
        return false;
    }

    public void Print(){
        System.out.println(list.get(index));
    }

    public void PrintAll(){
        this.list.forEach(s -> System.out.print(s + " "));
        System.out.print("\n");
    }

    @Override
    public Iterator<String> iterator() {
        return new listIterator();
    }

    public class listIterator implements Iterator<String>{
        private int index;

        @Override
        public boolean hasNext() {
            return this.index < list.size() - 1;
        }

        @Override
        public String next() {
            return list.get(index++);
        }
    }
}
