
import java.io.*;

public class ByteArray {
    public static void main(String[] args){
        String fileip = "photo1-ip.png";
        String fileop = "photo2-op.png";

        try{
            FileInputStream fis = new FileInputStream(fileip);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            int i;
            while((i = fis.read()) != -1){
                baos.write(i);
            }
            byte bytes[] = baos.toByteArray();
            ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
            FileOutputStream fos = new FileOutputStream(fileop);
            int k;
            while((k = bais.read())!=-1){
                fos.write(k);
            }
            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
