import java.util.*;

public class BankingSystem {
    
    Map<Long, Integer> accounts = new HashMap<>();
    Map<Integer, Long> sortedAccounts = new TreeMap<>();

    public void addAccount(long accountNumber, int balance){
        accounts.put(accountNumber,balance);
    }

    public void viewAccounts(){
        System.out.println("Accounts in Magadha Bank");
        for(Map.Entry<Long,Integer> entry: accounts.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public void viewByBalance(){
        System.out.println("\nAccounts sorted by balance");
        for(Map.Entry<Long,Integer> entry : accounts.entrySet()){
            long accountNumber = entry.getKey();
            int balance = entry.getValue();
            sortedAccounts.put(balance,accountNumber);
        }

        for(Map.Entry<Integer,Long> entry : sortedAccounts.entrySet()){
            System.out.println(entry.getValue() + " - " + entry.getKey());
        }
    }
}

class Bank {
    public static void main(String[] args){
        BankingSystem magadha = new BankingSystem();
        magadha.addAccount(753961147, 500000);
        magadha.addAccount(852369456, 70000);
        magadha.addAccount(741685419, 200000);
        magadha.viewAccounts();
        magadha.viewByBalance();
    }
    
}