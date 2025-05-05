
import java.util.Scanner;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
public class CustomException {
    public static void validateAge(int age) throws InvalidAgeException{
        if(age>=18) System.out.println("Access granted!");
        else throw new InvalidAgeException("Age must be 18 or above");
    }

    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            System.out.println("Enter age : ");
            int age = input.nextInt();
            validateAge(age);
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
