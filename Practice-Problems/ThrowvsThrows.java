
public class ThrowvsThrows {

     public static void calculateInterest(double amount, double rate, int years) throws IllegalArgumentException{
        if(amount<0 || rate<0){
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
        }
        else System.out.println((amount*rate*years)/100);
    }
    public static void main(String[] args){
         try{
             calculateInterest(1000,-7,1);
         }
         catch(IllegalArgumentException e){
             System.out.println(e.getMessage());
         }
    }
}

