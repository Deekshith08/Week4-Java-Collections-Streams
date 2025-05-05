import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){
            int[] arr = {5,4,3,2,1};
            int index = input.nextInt();
            System.out.println("Value at index " + index + " : " + arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index");
        }
        catch(NullPointerException e){
            System.out.println("Array is not initialized");
        }
    }

}
