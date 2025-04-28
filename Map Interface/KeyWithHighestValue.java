import java.util.*;
public class KeyWithHighestValue {
    public static char keyWithHighestValue(Map<Character,Integer> map){
        int max = Integer.MIN_VALUE;
        char maxKey = ' ';
        
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if(entry.getValue() >max){
                max = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }
    public static void main(String[] args) {
        Map<Character,Integer> map = Map.of(
            'A',10,
            'B',20,
            'C',15
        );
        System.out.println(keyWithHighestValue(map));

    }
}
