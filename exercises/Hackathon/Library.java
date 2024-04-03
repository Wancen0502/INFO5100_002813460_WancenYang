import java.util.ArrayList;
import java.util.Iterator;


public class Library {

    private ArrayList<Book> booklist;

    public Library() {
        booklist = new ArrayList<Book>();
    }

    public void getBooklist() {
        for (Book book : booklist) {
            System.out.println(book.getName());
        }
    }

    // add book to the library system
    public void addBook(Book b) {
        this.booklist.add(b);
    }


    // add book to the library system and print a reminding sentence.
    public void addBookGuide(Book b) {
        this.booklist.add(b);
        System.out.println(b.getName() + " has been added to the library.");
    }

    public void removeBook(String isbn) { // remove book from library.
        ArrayList<Book> checklist = new ArrayList<>();
        Iterator<Book> iterator = booklist.iterator();
        while (iterator.hasNext()) { // loop for view the book list;
            Book book = iterator.next();
            if (book.getISBN().equals(isbn)) { // check if the book which want to be removed by the user is existing.
                checklist.add(book);
                iterator.remove(); // if yes, then remove
                System.out.println(book.getName() + " has been remove for the library.");
            }
        }
        if (checklist.size() == 0) { // handle to the error that the removing book doesn't exist in the System.
            System.out.println("Sorry,the book you try to remove doesn't exist in the library.");
        }
    }



    public void displayAvailableBook() {
        System.out.println("Here is the information of available books:");
        System.out.println(" ");
        for (Book book : booklist) { // loop for view the book list and record the books which are available.
            if (book.isAvailable() == true) {
                book.printInformation();
                System.out.println(" ");
            }
        }
    }

    public void SearchBookByTitle(String bt) {
        ArrayList<Book> checklist = new ArrayList<Book>();
        String search = bt.toLowerCase();
        System.out.println("Here is the book information you might find:");
        for (Book book : booklist) { // loop for viewing the book in the library
            String temp = book.getName().toLowerCase();
            if (temp.contains(search)) { // check if the book might be found by the user
                book.printInformation();
                checklist.add(book);
            }
        }
        if (checklist.size()==0) { // handle to error that the user try to book which isn't in the library.
            System.out.println("Sorry, we didn't find the book you want.");
        }
    }

    public void SearchBookByAuthor(String a) {
        ArrayList<Book> checklist = new ArrayList<Book>();
        String search = a.toLowerCase();
        System.out.println("Here is the book information you might find:");
        for (Book book : booklist) { // loop for viewing the book in the library
            String temp = book.getAuthor().toLowerCase();
            if (temp.contains(search)) {
                book.printInformation();
                checklist.add(book);
            }
        }
        if (checklist.size()==0) { // handle to error that the user try to find an author of book which isn't in the library.
            System.out.println("Sorry, we didn't find the book you want.");
        }
    }

    public void SearchBookByGenre(String g) {
        ArrayList<Book> checklist = new ArrayList<Book>();
        String search = g.toLowerCase();
        System.out.println("Here is the book information you might find:");
        for (Book book : booklist) { // loop for viewing the book in the library
            String temp = book.getGenre().toLowerCase();
            if (temp.contains(search)) {
                book.printInformation();
                checklist.add(book);
            }
        }
        if (checklist.size()==0) { // handle to error that the user try to find a genre of book which isn't in the library.
            System.out.println("Sorry, we didn't find the book you are looking for.");

        }
    }

    public void borrowBook(String bt) {
        ArrayList<Book> checklist = new ArrayList<Book>();
        String borrowTitle = bt.toLowerCase();
        for (Book book : booklist) {
            String temp = book.getName().toLowerCase();
            if (temp.equals(borrowTitle)) {
                if (book.isAvailable() == true) { // check if the book is available.
                    book.checkOut();
                    checklist.add(book);
                }
            }
        }
        if (checklist.size() == 0) { // handle to error if the book wanted to borrow by the user is unavailable.
            System.out.println("Sorry,the book you want to borrow is unavailable.");
        } else {
            System.out.println("The book has been successfully checked out.");
        }


    }

    public void returnBook(String isbn){
        ArrayList<Book> checklist = new ArrayList<Book>();
        String returnISBN = isbn.toLowerCase();
        for (Book book : booklist) {  // Loop for viewing book list and checking if book the user want to return is in the system.
            String temp = book.getISBN().toLowerCase();
            if (temp.equals(returnISBN)) {
                    book.Return();
                    checklist.add(book);
            }
        }
        if (checklist.size() == 0) { // handle with the error if the user input incorrect ISBN.
            System.out.println("Sorry,we can't find the book you want to return in our system.");
        } else {
            System.out.println("The book has been successfully return.");
        }
    }

}

