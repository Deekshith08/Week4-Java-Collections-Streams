
class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message, double balance){
        super(message);
    }
}
public class CustomContext {
    public static void withdraw(double amount) throws InsufficientBalanceException{
        double balance = 5000;
        if(amount>balance){
            throw new InsufficientBalanceException("Insufficient balance",(amount-balance));
        }
        if(amount<0){
            throw new IllegalArgumentException("invalid Amount");
        }
        balance -= amount;
        System.out.print("Withdraw successful, new balance : " + balance);
    }
    public static void main(String[] args){
        double amount = -1000;
        try{
            withdraw(amount);
        }
        catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}

