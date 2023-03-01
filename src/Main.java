import com.javaSprintOne.*;
import jdk.jshell.Snippet;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {


        // System Intro
        System.out.println("|*******************************************|");
        System.out.println("| Welcome to the library management system! |");
        System.out.println("|*******************************************|" + "\n");



        // creating new authors
        Author someGuy = new Author("some guy", "1945/07/23", "Peter Rabbit");
        someGuy.setAuthorName("H.P LoveJoy");// editing Author

        Author JrTolken = new Author("J.R Tolken", "1976/04/08", "LOTR");

        // creating books
        Book book1 = new Book("Peter Rabbit", someGuy, "4567C", "BookComp", 1);
        Book book2 = new Book("LOTR", JrTolken, "1234B", "Pages Inc.", 2);
        Book book3 = new Book("The Hobbit", JrTolken, "3944A", "Book Inc.", 3);
        book3.setISBN("1234"); // editing book ISBN
        book3.setBookPublisher("Book print inc."); //editing Book publisher

        // setting status types for book based on borrowed or not borrowed by patrons
        book1.setType(StatusType.CHECKED_OUT);
        book2.setType(StatusType.OVERDUE);
        book3.setType(StatusType.AVAILABLE);




        // creating new patrons
        Patron newPatron1 = new Patron();
        newPatron1.setFirstLastName("Name: Devin Augot");
        newPatron1.setAddress("Address: 123 easy st.");
        newPatron1.setPhoneNum("Phone Number: 7092804944");


        Patron newPatron2 = new Patron();
        newPatron2.setFirstLastName("Name: Allison Butler");
        newPatron2.setAddress("Address: 123 easy st.");
        newPatron2.setPhoneNum("Phone Number: 7092803333");


        Patron newPatron3 = new Patron();
        newPatron3.setFirstLastName("Name: Cliff Augot");
        newPatron3.setAddress("Address: 123 water st.");
        newPatron3.setPhoneNum("Phone Number: 7098856767");

        // editing patrons
        newPatron3.setFirstLastName("Name: Tom Segura");



        // Testing library management system
        Library library = new Library();

        // adding books
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // adding authors
        library.addAuthor(someGuy);
        library.addAuthor(JrTolken);

        // adding patrons
        library.addPatron(newPatron1);
        library.addPatron(newPatron2);
        library.addPatron(newPatron3);




        // searching library search for book by author, ISBN, title
        System.out.println("Book Search Yielded:");
        System.out.println(library.searchBooks("J.R Tolken")); // return two books the hobbit & LOTR
        System.out.println(library.searchBooks("4567C")); // return Peter Rabbit
        System.out.println(library.searchBooks("The Hobbit")); // return by book name search parameters

        System.out.println("\n");


        // testing borrow and return

        // borrow
        System.out.println("Patron borrowing Book:");
        System.out.println("Available copies: " + " " + book1.getNumberOfCopies());
        library.borrowBook(book1, newPatron1);
        System.out.println("Available copies now: " + " " + book1.getNumberOfCopies());
        System.out.println("Borrowed book is:"+ " " + newPatron1.getBorrowedbooks() );
        System.out.println("\n");

        // return
        System.out.println("Patron returning Book:");
        System.out.println("Available copies: " + " " + book1.getNumberOfCopies());
        library.returnBook(book1, newPatron1);
        System.out.println("Available copies now: " + " " + book1.getNumberOfCopies());

        System.out.println("\n");

//    public Book(String title, Author author, String ISBN, String publisher, int qty) {
//            this.title = title;
//            this.author = author.getAuthorName();
//            this.ISBN = ISBN;
//            this.publisher = publisher;
//            this.noOfCopies = 0;
//        }
//
//        public void BorrowBook(int borrowQty) {
//            if ((this.qty - this.noOfCopies) < borrowQty){
//                System.out.println("Not Enough Copies");
//            } else {
//                this.noOfCopies += borrowQty;
//            }
//        }
//        @Override
//        public void ReturnBook(int returnQty) {
//            this.noOfCopies = Math.max(0, this.noOfCopies - returnQty);
//        }

    }
}