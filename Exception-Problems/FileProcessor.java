import java.io.*;
import java.util.*;
public class FileProcessor {
    public static void processFiles(List<String> filePaths){
        for(String file: filePaths){
            try(BufferedReader br = new BufferedReader(new FileReader(file))){
                String line;
                while((line = br.readLine()) != null){
                    System.out.println(line);
                }
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
    public static void main(String[] args){
        List<String> files = Arrays.asList("file1.txt","file2.txt");
        processFiles(files);

    }
}
