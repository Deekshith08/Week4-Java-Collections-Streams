import java.time.LocalDate;
import java.util.*;
class Policy{
    private int policyNumber;
    private String policyHolderName;
    private LocalDate expiryDate;
    private String type;
    private double premiumAmount;

    Policy(int policyNumber, String holderName, LocalDate expiryDate, String type, double amount){
        this.policyNumber = policyNumber;
        this.policyHolderName = holderName;
        this.expiryDate = expiryDate;
        this.type = type;
        this.premiumAmount = amount;
    }
    public int getPolicyNumber() { return policyNumber; }
    public String getPolicyHolderName() { return policyHolderName; }
    public LocalDate getExpiryDate() { return expiryDate; }
    public String getType() { return type; }
    public double getPremiumAmount() { return premiumAmount; }

    public void display(){
        System.out.println("Policy Number : " + policyNumber);
        System.out.println("Holder Name : " + policyHolderName);
        System.out.println("Expiry Date : " + expiryDate);
        System.out.println("Coverage Type : " + type);
        System.out.println("Premium Amount : " + premiumAmount);
    }
}
public class PolicyManagement {
    Set<Policy> hashPolicies = new HashSet<>();
    Set<Policy> linkedPolicies = new LinkedHashSet<>();
    Comparator<Policy> policyComparator =(p1,p2) -> p1.getExpiryDate().compareTo(p2.getExpiryDate());
    Set<Policy> treePolicies = new TreeSet<>(policyComparator);

    public void addPolicy(Policy p){
        hashPolicies.add(p);
        linkedPolicies.add(p);
        treePolicies.add(p);
    }

    public void displayAllPolicies(){
        System.out.println("\n---All Policies---");
        for(Policy p: linkedPolicies){
            p.display();
            System.out.println();
        }
    }
    

    public void policyExpiringSoon(){
        System.out.println("\n---Policies Expiring soon---");
        LocalDate date = LocalDate.now().plusDays(30);
        for(Policy p: linkedPolicies){
            if(p.getExpiryDate().isBefore(date)){
                p.display();
            }
        }
    }

    public void policyByType(String type){
        System.out.println("\n---Policy By given type---");
        for(Policy p: linkedPolicies){
            if(p.getType().equals(type)){
                p.display();
            }
        }
    }

    public  void sortedByExpiry(){
        System.out.println("\n---Policies sorted by Expiry Date---");
        for(Policy p : treePolicies){
            p.display();
        }
    }
}

class InnerPolicyManagement {
    public static void main(String[] args){
        PolicyManagement pm = new PolicyManagement();
        Policy p1 = new Policy(001, "Raj", LocalDate.of(2025,05,05), "Home", 500000);
        Policy p2 = new Policy(002, "San", LocalDate.of(2026,05,07), "Health", 1000000);
        pm.addPolicy(p1);
        pm.addPolicy(p2);
        pm.displayAllPolicies();
        pm.policyExpiringSoon();
        pm.policyByType("Health");
        pm.sortedByExpiry();
    }
}