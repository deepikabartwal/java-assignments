package libraryProblem;

import java.awt.print.Book;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to library.");
        while (true) {
            System.out.println("Enter Choice.");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Reader Name to insert");
                    String readerName = scanner.nextLine();
                    library.addNewMember(readerName);
                    break;

                case 2:
                    System.out.println("Book Name to insert");
                    String bookname = scanner.nextLine();
                    boolean wasSuccessfull = library.addBook(bookname);
                    System.out.println(wasSuccessfull ? "Added Successfully" : "Already Exist");
                    break;

                case 3:
                    System.out.println("Showing Library details");
                    System.out.println(library.toString());
                    break;

                default:
                    System.out.println("Thanks for visiting");
                    System.out.println("Visit us  again;");
                    System.exit(0);
            }
        }
    }

}

