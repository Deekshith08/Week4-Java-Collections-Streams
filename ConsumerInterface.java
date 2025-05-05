import java.util.*;
import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args){
        List<String> words = Arrays.asList("Hello","Halo","Byee");
        Consumer<String> printUpperCase = n -> System.out.println(n.toUpperCase());
        words.forEach(printUpperCase);
    }
}
