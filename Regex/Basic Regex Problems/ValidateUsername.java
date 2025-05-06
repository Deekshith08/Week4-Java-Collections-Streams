import java.util.regex.*;
import java.util.Scanner;
public class ValidateUsername {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter user name : ");
        String username = input.next();
        String regex = "[a-zA-Z]+[a-zA-Z0-9_]{5,15}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(username);
        if(matcher.matches()){
            System.out.println("Valid UserName");
        }
        else{
            System.out.println("Invalid Username");
        }

    }
}
