@FunctionalInterface
interface custom{
    int square(int n);
    default void print(int res){
        System.out.println("Result : " + res);
    }
}
public class FunctionalDefaultMethod {
    public static void main(String[] args) {
        custom c = num -> num*num;
        c.print(c.square(2));
    }
}
