package libraryProblem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @BeforeEach
    void setUp() {
        Library stepLibrary = new Library();
        stepLibrary.addBook("Thinking In Java");
        stepLibrary.addBook("Let Us C");

    }

    @Test
    void isBookAvailable() {
    }

    @Test
    void addBook() {
    }

    @Test
    void lendBook() {
    }

    @Test
    void addNewMember() {
    }

    @Test
    void removeMembers() {
    }

    @Test
    void returnBooks() {
    }

    @Test
    void countReadersBorrowedBooks() {
    }

    @Test
    void getBorrowerDetails() {
    }

    @Test
    void removeBook() {
    }

    @Test
    void wasBookRemoved() {
    }

    @Test
    void toString() {
    }
}