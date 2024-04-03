import java.util.Scanner;

public class Control {

    public Control(Library library) {

        Scanner sc = new Scanner(System.in);
        boolean exitCode = false; // application control

        while (!exitCode) {

            System.out.println("Welcome To library Management System.");
            // users should select their identity before using the system.
            System.out.println("Please select your identity: 1.visitor, 2.Administrator, or select 3 keys to exit the system.");
            String control = sc.next(); // input 1 or 2 or 3

            if (control.equals("1")) { // for the visitor, they can check the information of available book, search books, borrow and return books.
                System.out.println("Please select an option: ");
                System.out.println("1.check the information of available book");
                System.out.println("2.search books in the System");
                System.out.println("3.borrow books");
                System.out.println("4.return books");

                control = sc.next(); // input 1 or 2 or 3 or 4

                if (control.equals("1")) { // check the information of available book
                    library.displayAvailableBook();
                } else if (control.equals("2")) { // search books in the System
                    sc.nextLine();
                    System.out.println("Your search wants to base on: 1.Book Name, 2.Book Author, 3.Book Genre"); // search by title, author, or genre.
                    control = sc.next();
                    if (control.equals("1")) {
                        System.out.println("Please input the name of book you want to look for:");
                        sc.nextLine();
                        control = sc.nextLine();
                        library.SearchBookByTitle(control);
                    } else if (control.equals("2")) {
                        System.out.println("Please input the name of book's author you want to look for:");
                        sc.nextLine();
                        control = sc.nextLine();
                        library.SearchBookByAuthor(control);
                    } else if (control.equals("3")) {
                        System.out.println("Please input the genre of books you want to look for: ()");
                        sc.nextLine();
                        control = sc.nextLine();
                        library.SearchBookByGenre(control);
                    }
                } else if (control.equals("3")) {
                    sc.nextLine();
                    System.out.println("The book you want to borrow is: (please enter the full name of the book accurately)");
                    control = sc.nextLine();
                    library.borrowBook(control);
                } else if (control.equals("4")) {
                    sc.nextLine();
                    System.out.println("The ISBN of the book you want to return is: ");
                    control = sc.nextLine();
                    library.returnBook(control);
                }
            } else if (control.equals("2")) {  //action for administrator, they can add or remove books in the system.
                System.out.println("Please select an option: ");
                System.out.println("1.add books to the system");
                System.out.println("2.remove books from the system");
                control = sc.next(); // input 1 or 2

                if (control.equals("1")) {
                    Book b = new Book(); // create a new book object for adding action.
                    sc.nextLine();
                    System.out.println("Please input the name of book you want to add:");
                    control = sc.nextLine();
                    b.setTite(control);
                    System.out.println("Please input the author of book you want to add:");
                    control = sc.nextLine();
                    b.setAuthor(control);
                    System.out.println("Please input the genre of book you want to add:");
                    control = sc.nextLine();
                    b.setGenre(control);
                    System.out.println("Please input the ISBN of book you want to add:");
                    control = sc.nextLine();
                    b.setISBN(control);
                    library.addBookGuide(b);
                } else if (control.equals("2")) {
                    sc.nextLine();
                    System.out.println("Please input the ISBN of book you want to remove:");
                    control = sc.next();
                    library.removeBook(control);
                }

            } else if (control.equals("3")) {
                exitCode = true;
            }

            System.out.println("Thank you for using library Management System.");
            System.out.println(" ");

        }
    }
}
