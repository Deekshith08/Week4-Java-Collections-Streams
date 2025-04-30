import java.io.*;
public class FilterStreams {
    public static void main(String[] args){
        String fileip = "names-ip.txt";
        String fileop = "upper-names.txt";
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileip));
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileop));
            String line;
            while((line = br.readLine())!=null){
                bw.write(line.toUpperCase());
                bw.newLine();
            }
            System.out.println("Converted to Uppercase and added into op file");
            br.close();
            bw.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
