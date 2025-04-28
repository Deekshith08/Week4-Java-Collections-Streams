import java.util.*;
public class RemoveDuplicates {

    public static void removeDuplicates(List<Integer> list){
        for(int i=0; i<list.size(); i++){
            int temp = list.get(i);
            for(int j=i+1; j<list.size(); j++){
                if(list.get(j) == temp){
                    list.remove(j);
                    j--;
                }
            }
        }
    }
    
    public static void main(String[] arh){
        List<Integer> list = new ArrayList<>();
        int[] arr = {3,1,2,2,3,4};
        for(int a:arr) {
            list.add(a);
        }
        
        removeDuplicates(list);
        System.out.println(list);
    }
}
