import java.util.Scanner;
public class FinallyBlockExecution {
    public static void divide(int a , int b){
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Operation Completed");
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        divide(a,b);
    }
}
