import java.io.IOException;

public class CheckedAndUnchecked {
    public static void exceptions(String input,int divisor) throws IOException {
        if(input == null) throw new IOException("input cannot be null");
        int n = 10/divisor;
        System.out.println(n);
    }
    public static void main(String[] args){
        try{
            exceptions(null,0);
        }
        catch(IOException e){
            System.out.println("Checked exception : " + e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println("Unchecked exception : " + e.getMessage());
        }
        try{
            exceptions("c",0);
        }
        catch(IOException e){
            System.out.println("Checked exception : " + e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println("Unchecked exception : " + e.getMessage());
        }
    }
}
