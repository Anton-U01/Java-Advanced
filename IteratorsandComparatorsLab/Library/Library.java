package IteratorsandComparatorsLab.Library;

import java.util.Iterator;

public class Library implements Iterable<Book> {
    private Book[] books;

    public Library(Book... books){
        this.books = books;
    }

    @Override
    public Iterator<Book> iterator() {
        return new assistant();
    }

    private final class assistant implements Iterator<Book>{
        private int index;
        public assistant(){
            this.index = 0;
        }
        @Override
        public boolean hasNext() {
            return this.index < books.length;
        }

        @Override
        public Book next() {
            return books[index++];
        }
    }
}
