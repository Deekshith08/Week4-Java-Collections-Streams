import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Employee{
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
    public String toString(){
        return id + " - Name: " + name + " - Dep: " + department + " - Salary: " + salary;
    }
}
public class EmployeeDataProcessing {
    public static void filterByDepAndSalary(List<Employee> list){
        Predicate<Employee> dep = e -> e.department.equals("Engineering");
        Predicate<Employee> salary = e -> e.salary>80000;
        Predicate<Employee> combined = dep.and(salary);
        list.stream().filter(combined).forEach(System.out::println);
    }
    public static void sortBySalary(List<Employee> list){
        list.stream().sorted((e1,e2) -> Double.compare(e1.salary,e2.salary)).forEach(System.out::println);
    }
    public static void groupByDept(List<Employee> list){
        Map<String,List<Employee>> groupbydept = list.stream().collect(Collectors.groupingBy(emp-> emp.department));
        groupbydept.forEach((dept,empList)->{
            System.out.println("Department : " + dept);
            empList.forEach(System.out::println);
        });
    }
    public static void avgSalaryByDept(List<Employee> list){
        Map<String, Double> avgSalaryByDept = list.stream()
                .collect(Collectors.groupingBy(
                        emp -> emp.department,
                        Collectors.averagingDouble(emp -> emp.salary)
                ));

        // Print the results
        avgSalaryByDept.forEach((dept, avgSalary) ->
                System.out.printf("Department: %s, Average Salary: %.2f%n", dept, avgSalary));
    }
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee(0,"sinad","Engineering",95000),
                new Employee(1,"Yash","HR",40000),
                new Employee(2,"Deva","Testing",30000),
                new Employee(3,"sam","Engineering",85000)
        );
        //filterByDepAndSalary(list);
        //sortBySalary(list);
        //groupByDept(list);
        avgSalaryByDept(list);
    }
}
