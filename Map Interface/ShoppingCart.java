import java.util.*;

public class ShoppingCart {
    
    Map<String, Integer> productPrices = new HashMap<>();
    Map<String, Integer>  order = new LinkedHashMap<>();

    public void addProdduct(String name, int price){
        productPrices.put(name, price);
        order.put(name,price);
    }

    public void displayCart(){
        System.out.println("----Displaying Cart----");
        for(Map.Entry<String,Integer> entry: order.entrySet()){
            String key = entry.getKey();
            int val = entry.getValue();
            System.out.println(key + " - " + val);
        }
    }

    public void sortedByPrice(){
        System.out.println("\n---Cart Sorted By Price---");
        Map<Integer,List<String>> priceSorted = new TreeMap<>();
        for(Map.Entry<String,Integer> entry: order.entrySet()){
            String product = entry.getKey();
            int cost = entry.getValue();
            if(!priceSorted.containsKey(cost)){
                priceSorted.put(cost, new ArrayList<>());
            }
            priceSorted.get(cost).add(product);
        }

        for(Map.Entry<Integer,List<String>> entry : priceSorted.entrySet()){
            System.out.println(entry.getValue() + " - " + entry.getKey());
        }
    }
}

class Main {
    public static void main(String[] args) {
        ShoppingCart reliance = new ShoppingCart();
        reliance.addProdduct("KetchUp",120);
        reliance.addProdduct("Milk", 28);
        reliance.addProdduct("Choco Pie", 150);
        reliance.displayCart();
        reliance.sortedByPrice();
    }
    
}
