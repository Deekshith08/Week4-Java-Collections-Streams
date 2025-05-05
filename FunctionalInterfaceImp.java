@FunctionalInterface
interface Sum{
    int getsum(int a, int b);
}
public class FunctionalInterfaceImp{
    public static void main(String[] args) {
        Sum s = (a,b) -> a+b;
        int res = s.getsum(2,3);
        System.out.println("result : " + res);
    }
}
