import java.util.*;
public class NthElement {

    public static char NthElementFromEnd(LinkedList<Character> list, int n){
        char ch = list.getLast();
        int temp = list.indexOf(ch);//4
        return list.get(temp-(n-1));
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        LinkedList<Character> list = new LinkedList<>();
        list.add('A'); list.add('B'); list.add('C');
        list.add('D'); list.add('E');
        System.out.println("Enter nth position from end : ");
        int n = input.nextInt();
        input.close();
        System.out.println(NthElementFromEnd(list,n));
    }
}
