import java.util.regex.*;
import java.util.Scanner;
public class HexColorCode {
    public static void main(String[] args){
        String regex = "#[0-9A-Fa-f]{6}";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter hex color code : ");
        String code = input.next();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(code);
        if(matcher.matches()){
            System.out.println("Valid hex color code");
        }
        else System.out.println("Invalid hex color code");
    }
}
