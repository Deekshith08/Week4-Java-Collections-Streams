import java.util.*;
import java.util.function.Predicate;
public class PredicateComposition {
    public static void main(String[] args){
        List<String> list = Arrays.asList("Hello","Pillow","Main","Cello","Class","Fellow");
        Predicate<String> len =  n->n.length()>5;
        Predicate<String> sub = n->n.contains("llo");
        Predicate<String> combined = len.and(sub);
        list.stream().filter(combined).forEach(System.out::println);
    }
}
