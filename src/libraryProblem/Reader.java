package libraryProblem;

import java.util.Set;

public class Reader {
    private String name;
    private Set<String> borrowedBooks;

    public Reader(String name) {
        this.name = name;
    }

    public void borrowBooks(String bookName) {
        this.borrowedBooks.add(bookName);
    }

    public void returnBook(String bookname) {
        this.borrowedBooks.remove(bookname);
    }

    public boolean hasBorrowedBook(String bookName) {
        return this.borrowedBooks.contains(bookName);
    }

    public String getName() {
        return name;
    }
    public int getBorrowedBooksCount(){
        return this.borrowedBooks.size();
    }
}

