import java.io.*;
public class BufferedStreams {
    public static void buffered(){
        String fileip = "photo1-ip.png";
        String fileop = "photo1-op1.png";
        long start = System.nanoTime();
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileip))){
            BufferedOutputStream bos = new BufferedOutputStream (new FileOutputStream(fileop));
            int i;
            while ((i = bis.read()) != -1) {
                bos.write(i);
            }
            bos.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        long end = System.nanoTime();
        System.out.println("Buffered Stream : " + (end-start) + " ns");
    }

    public static void unbuffered(){
        String fileip = "photo1-ip.png";
        String fileop = "photo1-op2.png";
        long start = System.nanoTime();
        try(FileInputStream bis = new FileInputStream(fileip)){
            FileOutputStream bos = new FileOutputStream(fileop);
            int i;
            while ((i = bis.read()) != -1) {
                bos.write(i);
            }
            bos.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        long end = System.nanoTime();
        System.out.println("Unbuffered Stream : " + (end-start) + " ns");
    }

    public static void main(String[] args) {
        buffered();
        unbuffered();
        
    }
}
