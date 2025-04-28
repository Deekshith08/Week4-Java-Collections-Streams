import java.util.*;
public class UnionAndIntersection {

    public static Set<Integer> findIntersection(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> intersection = new HashSet<>();
        for(int s:set1){
            if(set2.contains(s)){
                intersection.add(s);
            }
        }
        return intersection;
    }
    public static Set<Integer> findUnion(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> union = new HashSet<>();
        for(int s: set1){
            if(!union.contains(s)){
                union.add(s);
            }
        }
        for(int s: set2){
            if(!union.contains(s)){
                union.add(s);
            }
        }
        return union;
    }
    
    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(1,2,3,4);
        Set<Integer> set2 = Set.of(3,4,5);
        System.out.println("Union : " + findIntersection(set1, set2));
        System.out.println("Intersection : " + findUnion(set1, set2));
    }
}
