public class RethrowingExceptions {
    public static void performDivision(int numerator, int denominator) throws ArithmeticException{
        if(denominator == 0) throw new ArithmeticException("cannot divide by zero");
        else System.out.println((numerator/denominator));
    }
    public static void calculate(int numerator, int denominator) throws ArithmeticException{
        try{
            performDivision(numerator,denominator);
        }
        catch(ArithmeticException e){
            throw new ArithmeticException("Error in calculate method, " + e.getMessage());
        }
    }
    public static void main(String[] args){
        int num = 1;
        int den = 0;
        try {
            calculate(num, den);
        }
        catch (ArithmeticException e){
            System.out.println("Exception handling in main, " + e.getMessage());
        }
    }
}
