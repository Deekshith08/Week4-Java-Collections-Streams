import java.util.*;
public class OptionalHandling {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Optional<Integer> max = list.stream().max((a,b)->Integer.compare(a,b));
        max.ifPresentOrElse(
            value -> System.out.println(value),
            () -> System.out.println("List is empty")
        );
    }
}
