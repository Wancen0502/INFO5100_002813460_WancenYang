public class Book {

    private String title;
    private String author;
    private String genre;
    private String ISBN;
    private Boolean availability;
    private int borrowTimes; // track how many times a book has been borrowed.

    public Book(){
        availability = true;
        borrowTimes = 0;

    }

    public Book(String t, String a, String g, String isbn, Boolean c){
        title = t;
        author = a;
        genre = g;
        ISBN = isbn;
        availability = c;
        borrowTimes = 0;

    }

    public String getName() {
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getGenre(){
        return genre;
    }

     public String getISBN(){
        return ISBN;
     }

     public int getBorrowTimes(){
        return borrowTimes;
     }

     public void setTite(String t){
        this.title = t;
     }

    public void setAuthor(String a){
        this.author = a;
    }

    public void setGenre(String g){
        this.genre = g;
    }

    public void setISBN(String isbn){
        this.ISBN = isbn;
    }

    public boolean isAvailable(){
        return availability;
    }

    // change the book status when it was checked out.
    public void checkOut(){
        borrowTimes = borrowTimes+1;
        this.availability = false;
    }

    // change the book status when it was returned .
    public void Return(){
        this.availability = true;
    }


    public void printInformation(){
        System.out.println("Book Name: "+ getName());
        System.out.println("Author: "+ getAuthor());
        System.out.println("Genre: " + getGenre());
        System.out.println("ISBN: " + getISBN());
        System.out.println("This book has been borrowed for " + getBorrowTimes() +" times." );
        if (isAvailable()==true){ // check if the book is available.
            System.out.println("is available: yes" );
        }
        else{
            System.out.println("is available: no" );
        }
        System.out.println(" " );

    }

}
