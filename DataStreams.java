import java.io.*;
public class DataStreams {
    public static void writeData(String file, int rollNo, String name, double gpa){
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))){
            dos.writeInt(rollNo);
            dos.writeUTF(name);
            dos.writeDouble(gpa);
            System.out.println("Written into file");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void readData(String file){
        try(DataInputStream dis = new DataInputStream(new FileInputStream(file))){
            int roll = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();
            System.out.println("Retrieved Successfully");
            System.out.println("Name : " + name);
            System.out.println("Roll. No : " + roll);
            System.out.println("GPA : " + gpa);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        String file = "datastreams.txt";
        writeData(file, 1, "raj", 8.8);
        readData(file);
    }
}
