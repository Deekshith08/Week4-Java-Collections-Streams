
import java.util.InputMismatchException;
import java.util.Scanner;
public class UncheckedException {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        try{
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int result = num1 / num2;
            System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println("cannot divide by zero");
        }
        catch(InputMismatchException e){
            System.out.println("cannot divide non numeric ");
        }

    }
}
