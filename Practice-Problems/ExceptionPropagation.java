public class ExceptionPropagation {
    public static void method1() throws ArithmeticException{
        int a = 10/0;
        System.out.println(a);
    }
    public static void method2(){
        method1();
    }
    public static void main(String[] args){
        try{
            method2();
        }
        catch(ArithmeticException e){
            System.out.println("Handled exception in main" + e.getMessage());
        }
    }
}
