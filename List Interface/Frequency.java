import java.util.*;

public class Frequency {

    public static HashMap frequency(List<String> list){
        HashMap<String,Integer> map= new HashMap<>();
        for(String name:list){
            int freq = map.getOrDefault(name, 0);
            map.put(name, freq+1 );
        }
        return map;
    }
    public static void main(String[] args){
        List<String> list = Arrays.asList("apple", "banana", "orange","banana");
        System.out.println(frequency(list));
    }
}
