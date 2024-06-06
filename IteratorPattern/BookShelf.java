package IteratorPattern;

import java.util.Iterator;
public class BookShelf {
    private Book[] books;
    private int last = 0;
    public BookShelf(int maxsize) { this.books = new Book[maxsize]; }
    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }
    public Iterator createIterator() { return new BookShelfIterator(this); }
    public Book getBookAt(int index) { return books[index]; }
    public int getLength() { return last; }
}
