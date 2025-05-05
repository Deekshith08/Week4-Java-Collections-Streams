import java.util.function.BiFunction;

public class BiFunctionInterface {
    public static void main(String[] args) {
        BiFunction<String,String,String> concatenate= (a,b)-> (a+" "+b);
        System.out.println("After Concatenation : " + concatenate.apply("Hello","World"));
    }
}
