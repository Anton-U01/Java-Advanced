package IteratorsandComparatorsLab.BookComparator;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

    @Override
    public int compare(Book firstBook, Book secondBook) {
        int result;
        if(firstBook.getTitle().compareTo(secondBook.getTitle()) == 0){
            return result = Integer.compare(firstBook.getYear(),secondBook.getYear());
        }
        return firstBook.getTitle().compareTo(secondBook.getTitle());

    }
}
