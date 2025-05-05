import java.util.Scanner;
public class NestedTryCatch {
    public static void main(String[] args){
        int[] arr = {10,20,30};
        int div = 0;
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter index : ");
            int index = input.nextInt();
            System.out.println(arr[index]/div);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Array Index");
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
    }
}
