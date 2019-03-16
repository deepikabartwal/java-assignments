package libraryProblem;

import java.util.*;

public class Library {
    private Set<String> allLibraryBooks = new HashSet<>();
    private Map<String, Reader> borrowersRegister = new HashMap<>();
    private Set<String> removedBooks = new HashSet<>();
    private Map<String,Reader> readers = new HashMap<>();


    public boolean isBookAvailable(String bookName){
        return this.allLibraryBooks.contains(bookName);
    }

    public boolean addBook(String bookName){
       return this.allLibraryBooks.add(bookName);
    }
    public void lendBook(String bookName,Reader borrower){
        if(this.isBookAvailable(bookName)) {
            Reader borrowerRecord = this.readers.get(borrower.getName());
            borrowerRecord.borrowBooks(bookName);
            this.allLibraryBooks.remove(bookName);
            this.borrowersRegister.put(bookName, borrower);
        }
        System.out.println("This book is available right now");
    }
    public void addNewMember(String newReader){
        if(this.readers.containsKey(newReader)){
            System.out.println("You are already a member");
            return;
        }
        this.readers.put(newReader,new Reader(newReader));
        System.out.println("You have been successfully added as a member");
    }
    public void removeMembers(Reader readerTobeRemoved){
        this.readers.remove(readerTobeRemoved);
    }
    public void returnBooks(String bookName, Reader borrower){
        this.borrowersRegister.remove(bookName);
        Reader borrowerRecord = this.readers.get(borrower.getName());
        borrowerRecord.returnBook(bookName);
        this.allLibraryBooks.add(bookName);
    }
    public int  countReadersBorrowedBooks(Reader member){
        Reader specifiedMember = this.readers.get(member);
        int booksBorrowedCount = specifiedMember.getBorrowedBooksCount();
        return booksBorrowedCount;
    }
    public Reader getBorrowerDetails(String bookName){
        Reader borrower = this.borrowersRegister.get(bookName);
        return borrower;
    }
    public void removeBook(String bookName){
        this.allLibraryBooks.remove(bookName);
        this.removedBooks.add(bookName);
    }
    public boolean wasBookRemoved(String bookName){
        return this.removedBooks.contains(bookName);
    }
    @Override
    public String toString() {
        return "Library{" +
                "books=" + allLibraryBooks +
                ", readers=" + readers +
                '}';
    }
}

