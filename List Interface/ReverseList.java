import java.util.*;
public class ReverseList {
    public static <T> void ReverseArrayList(List<T> list){
        int n = list.size();
        int index = 0;
        for(int i =n-1; i>=0; i--){
            T temp = list.get(i);//6
            list.set(i,list.get(index));
            list.set(index,temp);
            index++;
            if(index>=i) break;
        }
    }

    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        
        ReverseArrayList(list);
        System.out.println(list);
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1); list2.add(2);list2.add(3);
        list2.add(4);
        
        ReverseArrayList(list2);
        System.out.println(list2);
    }
}