import java.io.*;

public class FileHandling {
    public static void main(String[] args)  {
        
    
        String fileip = "names-ip.txt";
        String fileop = "names-op.txt";
        try(FileInputStream fis = new FileInputStream(fileip)){
            FileOutputStream fos = new FileOutputStream(fileop);
            int i;
            while((i = fis.read()) != -1){
                fos.write(i);
            }
            System.out.println("wrote into new file successfully");
            fos.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}