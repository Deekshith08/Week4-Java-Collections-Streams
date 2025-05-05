import java.io.*;

public class MultipleResources {
    public static void multipleFiles(String[] files, String fileop){
        for(String file:files){
            try(BufferedReader br = new BufferedReader(new FileReader(file));
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileop,true))){
                String line;
                while((line = br.readLine()) != null){
                    bw.write(line);
                    bw.newLine();
                }
                System.out.println(file + "is added into the output file");
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
    public static void main(String[] args){
        String[] files = {"file1.txt","file2.txt"};
        String fileop = "fileop.txt";
        multipleFiles(files,fileop);
    }
}
