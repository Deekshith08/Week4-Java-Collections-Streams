import java.util.*;
public class InvertMap {

    
    public static void main(String[] args){
        Map<Character,Integer> map1 = Map.of(
            'A',1,
            'B',2,
            'c',1
        );
        Map<Integer,List<Character>> map2 = new HashMap<>();
        for(Map.Entry<Character,Integer> entry: map1.entrySet()){
            Integer value = entry.getValue();
            Character key = entry.getKey();
            
            if(!map2.containsKey(value)){
                map2.put(value, new ArrayList<>());
            }
            map2.get(value).add(key);
        }
        System.out.println(map2);
    }
}
