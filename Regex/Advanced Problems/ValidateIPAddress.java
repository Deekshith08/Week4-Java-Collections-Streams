import java.util.regex.*;
import java.util.Scanner;
public class ValidateIPAddress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ipAddress = input.next();
        String regex = "(\\d{1,3}\\.){3}\\d{1,3}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ipAddress);
        if(matcher.matches()) System.out.println("Valid IPv4 Address");
        else System.out.println("Invalid IPv4 Address");
    }
}
