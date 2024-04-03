import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Create a new library
        Library library = new Library();
        //create 11 initial books and add them to the library
        Book b1 = new Book("To Kill a Mockingbird", "Harper Lee", "Classic", "9780061120084", true);
        Book b2 = new Book("1984", "George Orwell", "Dystopian", "9780451524935", true);
        Book b3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Literary", "9780743273565", true);
        Book b4 = new Book("The Catcher in the Rye", "J.D. Salinger", "Coming-of-Age", "9780316769488", true);
        Book b5 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "Fantasy", "9780590353427", true);
        Book b6 = new Book("Harry Potter and the Chamber of Secrets", "J.K. Rowling", "Fantasy", "9780439064873", true);
        Book b7 = new Book("Harry Potter and the Prisoner of Azkaban", "J.K. Rowling", "Fantasy", "9780439136365", true);
        Book b8 = new Book("Harry Potter and the Goblet of Fire", "J.K. Rowling", "Fantasy", "9780439139601", true);
        Book b9 = new Book("Harry Potter and the Order of the Phoenix", "J.K. Rowling", "Fantasy", "9780439358071", true);
        Book b10 = new Book("Harry Potter and the Half-Blood Prince", "J.K. Rowling", "Fantasy", "9780439785969", true);
        Book b11 = new Book("Harry Potter and the Deathly Hallows", "J.K. Rowling", "Fantasy", "9780545139700", true);

     // add the books to the library ,and now we have a demo library within 11 books.
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);
        library.addBook(b4);
        library.addBook(b5);
        library.addBook(b6);
        library.addBook(b7);
        library.addBook(b8);
        library.addBook(b9);
        library.addBook(b10);
        library.addBook(b11);


        new Control(library); // create a new control to operate the application.(more details of interactions of the book management system can find in Control Class.)


            // the below contents are for testing.
            //library.removeBook("9780061120084");
            //library.getBooklist();
            // library.displayAvailableBook();
            // library.SearchBookByTitle("To Kill a Mockingbird");
            // library.SearchBookByAuthor("Rowling");
            //library.SearchBookByGenre("Literary");


    }

}
