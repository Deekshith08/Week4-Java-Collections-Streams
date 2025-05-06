import java.util.regex.*;
public class ValidateSSN {
    public static void main(String[] args) {
        String text = "My SSN is 123-45-6789.";
        String regex = "\\d{3}-\\d{2}-\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println("Valid SSN found : " + matcher.group());
        }
        else{
            System.out.println("Not valid");
        }
    }
}
