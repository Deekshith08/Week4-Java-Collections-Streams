import java.util.*;


class Employee{
    String name;
    String department;
    Employee(String name, String department){
        this.department = department;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }    
}

public class GroupObjects {

    public static void groupObjects(List<Employee> employees){
        Map<String, List<Employee>> map = new HashMap<>();
        for(Employee emp: employees){
            String department = emp.getDepartment();
            if(!map.containsKey(department)){
                map.put(department, new ArrayList<>());
            }
            map.get(department).add(emp);
        }

        for(Map.Entry<String,List<Employee>> entry: map.entrySet()){
            String dep = entry.getKey();
            System.out.print(dep + " : ");
            for(Employee e: entry.getValue()){
                System.out.print(e.getName() + ",");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", "HR"));
        employees.add(new Employee("Bob", "IT"));
        employees.add(new Employee("Carol", "HR"));
        groupObjects(employees);
    }
}
