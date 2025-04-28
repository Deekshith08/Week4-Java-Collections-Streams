import java.util.*;
public class FindSubsets {

    public static boolean isSubset(Set<Integer> set1, Set<Integer> set2){
        for(int s:set1){
            if(!set2.contains(s)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(2,3);
        Set<Integer> set2 = Set.of(1,2,4);
        System.out.println(isSubset(set1, set2));
    }
}
