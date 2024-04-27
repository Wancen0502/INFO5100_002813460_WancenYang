import org.json.JSONObject;
import org.json.JSONArray;

public class Main {

    public static void main(String[] args) {

        // Create a new XMLParse() to parse the Book.xml document.
        new XMLparse("src/test/java/Book.xml");

        // Create JSON
        JOSNparse JP = new JOSNparse("{\n" +
                "  \"Book Shelf\": {\n" +
                "    \"Book1\":\n" +
                "      {\n" +
                "        \"title\": \"1984\",\n" +
                "        \"publishedYear\": \"1949\",\n" +
                "        \"numberOfPages\": \"328\",\n" +
                "        \"authors\": [\n" +
                "          \"George Orwell\"\n" +
                "        ]\n" +
                "      },\n" +
                "    \"Book2\":\n" +
                "      {\n" +
                "        \"title\": \"The Great Gatsby\",\n" +
                "        \"publishedYear\": \"1925\",\n" +
                "        \"numberOfPages\": \"180\",\n" +
                "        \"authors\": [\n" +
                "          \"F. Scott Fitzgerald\"\n" +
                "        ]\n" +
                "      },\n" +
                "    \"Book3\":\n" +
                "      {\n" +
                "        \"title\": \"Freakonomics: A Rogue Economist Explores the Hidden Side of Everything\",\n" +
                "        \"publishedYear\": \"2005\",\n" +
                "        \"numberOfPages\": \"315\",\n" +
                "        \"authors\": [\n" +
                "          \"Steven D. Levitt\",\n" +
                "          \"Stephen J. Dubner\"\n" +
                "        ]\n" +
                "      }\n" +
                "  }\n" +
                "}");


    // add one more book to the JSON
       JP.addElement(4, "The Theory of Everything: The Origin and Fate of the Universe"," 2006"," 212","Stephen Hawking"," Leonard Mlodinow");

        //Parse JSON.
        JP.parseJSON();





    }
}
