import java.util.*;
import java.io.*;
public class WordFrequencyCounter {
    
    public static Map<String,Integer> readFile (String filepath) throws IOException{
        Map<String,Integer> counter = new HashMap<>();
        String line;
        FileReader fr = new FileReader(filepath);
        BufferedReader br = new BufferedReader(fr);
        while ((line = br.readLine()) != null) {
            String words[] = (line.toLowerCase()).split("\\W+");
            for(String word: words){
                int freq = counter.getOrDefault(word, 0);
                counter.put(word,freq+1);
            }
        }
        return counter;
    }
    public static void main(String[] args) throws IOException {
        String filepath = "text.txt";
        System.out.println(readFile(filepath));
    }
}
