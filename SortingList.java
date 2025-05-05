import java.util.*;
class Person{
    String name;
    int age;
    double salary;
    Person(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String toString(){
        return name + " - Age: " + age + ", salary: " + salary;
    }
}
public class SortingList {
    public static void main(String[] args){
        List<Person> list = Arrays.asList(
               new Person("Raj",20,24000),
               new Person("Vasu",21,32000),
                new Person("Siva",25,40000)
        );
        list.sort((p1,p2) -> Integer.compare(p1.age,p2.age));
        for(Person p:list){
            System.out.println(p);
        }
    }
}
