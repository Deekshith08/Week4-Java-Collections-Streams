import java.util.*;

abstract class WarehouseItem{
    String itemName;
    double cost;
    WarehouseItem(String name, double cost){
        this.itemName = name;
        this.cost = cost;
    }
    abstract void displayInfo();
    public String getItemName() {
        return itemName;
    }
    public double getCost() {
        return cost;
    }
}

class Electronics extends WarehouseItem{
    int warranty;
    Electronics(String name, double cost, int warranty){
        super(name,cost);
        this.warranty = warranty;
    }
    public int getWarranty() {
        return warranty;
    }
    public void displayInfo(){
        System.out.println("\nItem Name : " + getItemName());
        System.out.println("Cost " + getCost());
        System.out.println("Warranty : " + getWarranty());
    }
}

class Groceries extends WarehouseItem{
    double discountAmount;
    Groceries(String name, double cost, double discountAmount){
        super(name,cost);
        this.discountAmount = discountAmount;
    }
    public double getDiscountAmount() {
        return discountAmount;
    }
    public void displayInfo(){
        System.out.println("\nItem Name : " + getItemName());
        System.out.println("Cost " + getCost());
        System.out.println("Warranty : " + getDiscountAmount());
    }
}

class Furniture extends WarehouseItem{
    double deliveryDays;
    Furniture(String name, double cost, double deliveryDays){
        super(name,cost);
        this.deliveryDays = deliveryDays;
    }
    public double getDeliveryDays() {
        return deliveryDays;
    }
    public void displayInfo(){
        System.out.println("\nItem Name : " + getItemName());
        System.out.println("Cost " + getCost());
        System.out.println("Warranty : " + getDeliveryDays());
    }
}

class Storage<T extends WarehouseItem>{
    List<T> items;

    Storage(){
        items = new ArrayList<>();
    }
    public void addItem(T item){
        items.add(item);
    }
    public List<T> returnList(){
        return items;
    }
    
}

class wildcard{
    static void displayStorage(List<? extends WarehouseItem> items){
        for(WarehouseItem item:items){
            item.displayInfo();
        }
    }
}

public class SmartWareHouse {

    public static void main(String[] args){
        Storage<Electronics> s1 = new Storage<>();
        Electronics e1 = new Electronics("Watch", 1000, 2);
        Electronics e2 = new Electronics("Phone", 20000, 1);
        s1.addItem(e2);
        s1.addItem(e1);
        wildcard.displayStorage(s1.returnList());
        Storage<Groceries> s2 = new Storage<>();
        s2.addItem(new Groceries("Sugar", 40, 5));
        wildcard.displayStorage(s2.returnList());
    }
}


