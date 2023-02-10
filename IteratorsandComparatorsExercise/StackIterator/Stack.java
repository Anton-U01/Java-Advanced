package IteratorsandComparatorsExercise.StackIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stack implements Iterable<Integer> {
    private List<Integer> stack = new ArrayList<>();

    public Stack(){
        this.stack = new ArrayList<>();
    }
    public void push(List<Integer> integers){
        stack.addAll(integers);
    }

    public int get(int index) {
        return stack.get(index);
    }

    public void pop(){
        try {
            stack.remove(iterator().next());
        } catch (Exception e){
            System.out.println("No elements");
        }
    }
    public int size(){
        return stack.size();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new iterator();
    }

    private final class iterator implements Iterator<Integer>{
        private int index;

        public iterator(){
            this.index = stack.size() - 1;
        }
        @Override
        public boolean hasNext() {
            return index >= 0;
        }

        @Override
        public Integer next() {
            return stack.get(index--);
        }
    }
}
