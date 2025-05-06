import java.util.regex.*;
import java.util.Scanner;
public class ValidateCreditCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cardNumber = input.next();
        String regex = "(4\\d{15}|5\\d{15})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cardNumber);
        if(matcher.matches()){
            if(cardNumber.startsWith("4")){
                System.out.println("Valid Visa Credit Card");
            }
            else System.out.println("Valid Master Credit Card");
            }
        else System.out.println("Invalid Credit Card");
    }
}
