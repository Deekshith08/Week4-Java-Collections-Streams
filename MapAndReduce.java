import java.util.*;
public class MapAndReduce {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        int res = list.stream().filter(n->n%2==0).map(n->n*n).reduce(0,(ans,n)->(ans+n));
        System.out.println(res);
    }
}
