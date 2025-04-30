import java.io.*;
public class ReadLargeFile {
    public static void main(String[] args) {
        String file = "names-ip.txt";
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while((line = br.readLine()) != null){
                String[] words = line.split(" ");
                for(String word: words){
                    if(word.equals("error")){
                        System.out.println(line);
                        break;
                    }
                }
            }
            br.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
