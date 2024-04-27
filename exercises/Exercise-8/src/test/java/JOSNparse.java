import org.json.JSONArray;
import org.json.JSONObject;

public class JOSNparse {

    JSONObject json;

    public JOSNparse(String s){
        json = new JSONObject(s);
    }

    public void parseJSON(){

        JSONObject bookShelf = json.getJSONObject("Book Shelf");

        for (int i = 1; i <= 4; i++) { // the loop for view the JSON
            JSONObject book = bookShelf.getJSONObject("Book" + i);
            String title = book.getString("title");
            String publishedYear = book.getString("publishedYear");
            String numberOfPages = book.getString("numberOfPages");
            JSONArray authorsArray = book.getJSONArray("authors");

            StringBuilder authors = new StringBuilder();
            for (int j = 0; j < authorsArray.length(); j++) {
                authors.append(authorsArray.getString(j));
                if (j < authorsArray.length() - 1) {
                    authors.append(", ");
                }

            }
            // Print information
            System.out.println("Title: " + title);
            System.out.println("Published Year: " + publishedYear);
            System.out.println("Number of Pages: " + numberOfPages);
            System.out.println("Authors: " + authors);
            System.out.println();
        }


    }

    public void addElement(int i, String t, String y, String pn, String a1, String a2){ // Method of adding new book to JSON
        JSONObject newBook = new JSONObject();
        newBook.put("title",t); // add title
        newBook.put("publishedYear", y); // add published year
        newBook.put("numberOfPages",pn); // add number of pages

        JSONArray authors = new JSONArray(); // create new array for adding author
        authors.put(a1);
        authors.put(a2);
        newBook.put("authors",authors);

        json.getJSONObject("Book Shelf").put("Book"+i, newBook); // add the book to book shelf

    }
}
