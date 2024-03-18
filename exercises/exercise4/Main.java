//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {

        // the subject to be checked against regex patterns.
        String[] subjects = {
                "Jennifer", // a name
                "680-207-5986", // a phone number
                "11/10/2001", // Date of Birth
                "123 Elm Street, Springfield, MA 01103, United States", // an address
                "Jennifer1999@gmail.com", // email
                "http://www.personal.com" // a website
        };

        // regex pattern for validation.
        String[] regexPatterns = {
                "Jenni", // name validation.
                "\\d{3}-\\d{3}-\\d{4}", //phone number validation.
                "[A-Za-z]+\\d+", // date validation.
                "^[a-zA-Z0-9]+[\\s]*[a-zA-Z0-9.\\-\\,\\#]+[\\s]*[a-zA-Z0-9.\\-\\,\\#]+[a-zA-Z0-9\\s.\\-\\,\\#]*$",
                "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b", // address validation.
                "https?://\\w+\\.\\w+" // website validation.
        };



        for (String subject : subjects) { // loop through subjects
            System.out.println(" ");
            System.out.println("Subject: " + subject);
            for (String regex : regexPatterns) { // loop through regex example
                Pattern pattern = Pattern.compile(regex); //compile the regex pattern
                Matcher matcher = pattern.matcher(subject);  // match the subject against the pattern

                if(matcher.find()){ // if find
                    System.out.println("Regex: " + regex + " match found: " + matcher.group());
            }
                else{ // else (not find)
                    System.out.println("Regex: " + regex + " no match found");
                }

                }

        }
    }
}
