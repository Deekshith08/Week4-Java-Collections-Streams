import java.util.*;
public class MergeTwoMaps {
    Map<Character,Integer> combined = new HashMap<>();
    public Map<Character,Integer> combine(Map<Character,Integer> map){
        
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            
            int freq = combined.getOrDefault(entry.getKey(), 0);
            combined.put(entry.getKey(), freq+entry.getValue());
            
        }
        return combined;
    }

    public void merge(Map<Character,Integer> map1,Map<Character,Integer> map2){
        combine(map1);
        combine(map2);
        System.out.println(combined);
    }
    
    public  void main(String[] args){
        Map<Character,Integer> map1 = Map.of('A',1,'B',2);
        Map<Character,Integer> map2 = Map.of('B',3,'C',4);
        merge(map1,map2);
    }
}
