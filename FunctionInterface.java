import java.util.function.Function;

public class FunctionInterface {
    public static void main(String[] args){
        Function<Integer,Double> area = r->Math.PI*r*r;
        System.out.println("Area : " + area.apply(5));
    }
}
