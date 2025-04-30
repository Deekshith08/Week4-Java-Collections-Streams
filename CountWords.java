import java.io.*;
import java.util.*;
public class CountWords {

    public static void countwords(String file){
        HashMap<String,Integer> count = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            
            String line;
            while((line = br.readLine()) != null){
                String[] words = line.split(" ");
                for(String word: words){
                    Integer freq = count.getOrDefault(word, 0);
                    count.put(word,freq+1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Map.Entry<String,Integer>> list = new ArrayList<>(count.entrySet());
        list.sort((e1,e2) -> e2.getValue().compareTo(e1.getValue()));
        for(int i=0; i<Math.min(5, list.size()); i++){
            System.out.println(list.get(i));
        }
    }
    public static void main(String[] args){
        String file = "top5.txt";
        countwords(file);

    }
}
