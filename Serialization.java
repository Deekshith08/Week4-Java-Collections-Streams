import java.io.*;
import java.util.*;
class Employee implements Serializable{
    int id;
    String name;
    String department;
    double salary;
    Employee(int id, String name, String department, double salary){
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    void display(){
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
        System.out.println("Department : " + department);
        System.out.println("Salary : " + salary);
    }
}
public class Serialization {
    public static void serialize(List<Employee> employees,String file){
        try(ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(file))){
            ous.writeObject(employees);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void deserialize(String file){
        List<Employee> employees = null;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
            employees = (List<Employee>) ois.readObject();
        }
        catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        for(Employee e: employees){
            e.display();
        }
        
    }
    public static void main(String[] args){
        List<Employee> employees = new ArrayList<>();
        Employee e1 = new Employee(1, "Maahi", "HR", 50000);
        Employee e2 = new Employee(2, "Rohit", "Finance", 45000);
        employees.add(e1);
        employees.add(e2);
        String file = "serialize.ser";
        serialize(employees, file);
        deserialize(file);
    }
}


