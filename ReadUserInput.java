import java.io.*;
public class ReadUserInput {
    public static void main(String[] args) {
        
        String file = "names-ip.txt";
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("Enter Name : ");
            String name = br.readLine();

            System.out.print("Enter age : ");
            int age = Integer.parseInt(br.readLine());

            System.out.print("Enter fav prg language : ");
            String lang = br.readLine();

            FileWriter fr = new FileWriter(file);
            fr.write(name + "\n");
            fr.write(age + "\n");
            fr.write(lang + "\n");
            fr.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
