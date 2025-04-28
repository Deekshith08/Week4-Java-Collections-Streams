import java.util.*;

public class SetToSortedList {

    public static List<Integer> makeSortedList(Set<Integer> set){
        List<Integer> list = new ArrayList<>();
        while(!set.isEmpty()){
            int min = Collections.min(set);
            set.remove(min);
            list.add(min);
        }
        return list;
    }
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(9);
        set.add(1);
        System.out.println(makeSortedList(set));
    }
}
