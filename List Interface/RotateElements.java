import java.util.*;

public class RotateElements {

    public static void rotateBy(List<Integer> list, int n){
        
        for(int i=0; i<n; i++){
            int temp = list.get(0);
            list.add(temp);
            list.remove(0);
            
        }
    }
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(10); list.add(20);
        list.add(30); list.add(40);
        Scanner input = new Scanner(System.in);
        System.out.println("No of Rotations : ");
        int n = input.nextInt();
        rotateBy(list, n);
        System.out.println(list);
        input.close();
    }
}
