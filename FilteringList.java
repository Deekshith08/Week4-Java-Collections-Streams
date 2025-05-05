import java.util.*;
public class FilteringList {
    public static void main(String[] args){
        List<String> list = Arrays.asList("Akash","Rakesh","Dhaman","Asha");
        list.stream().filter(string -> string.startsWith("A")).forEach(System.out::println);
    }
}
