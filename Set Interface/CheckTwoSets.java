import java.util.*;
public class CheckTwoSets {

    public static boolean compare(Set<Integer> set1, Set<Integer> set2){
        if(set1.size() == set2.size()){
            for(int s: set1){
                if(set2.contains(s)) return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args){
        Set<Integer> set1 = Set.of(1,2,3);
        Set<Integer> set2 = Set.of(3,2,1);
        System.out.println(compare(set1, set2));
    }
}
