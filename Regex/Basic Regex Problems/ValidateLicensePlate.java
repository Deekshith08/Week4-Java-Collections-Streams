import java.util.regex.*;
import java.util.Scanner;
public class ValidateLicensePlate {
    public static void main(String[] args) {
        String regex = "[A-Z]{2}[0-9]{4}";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter License Plate number : ");
        String number = input.next();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(number);
        if (matcher.matches()) {
            System.out.println("Valid");
        }
        else System.out.println("Invalid");
    }
}
