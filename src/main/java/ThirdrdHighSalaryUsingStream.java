import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ThirdrdHighSalaryUsingStream {
    public static void main(String[] args){

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "moti", 2000));
        empList.add(new Employee(2, "moti", 3000));
        empList.add(new Employee(4, "moti", 5000));
        empList.add(new Employee(7, "moti", 8000));

      Optional<Employee> emp =  empList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
    System.out.println(emp);

    List<Employee> list = empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList());
        System.out.println(list);

       // empList.stream().filter((s1,s2) -> s1.salary > s2. ).forEach(System.out::println);
    }
}

class Employee {
    int id;
    String name;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    double salary;


    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

