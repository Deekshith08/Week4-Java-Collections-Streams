import java.util.*;

public class SymmetricDifference {

    public static Set<Integer> findSymmetricDifference(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> sd = new HashSet<>();
        for(int s: set1){
            if(!set2.contains(s)){
                sd.add(s);
            }
        }
        for(int s: set2){
            if(!set1.contains(s)){
                sd.add(s);
            }
        }
        return sd;
    }
    
    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(1,2,3);
        Set<Integer> set2 = Set.of(3,4,5);
        System.out.println(findSymmetricDifference(set1, set2));
    }
}
