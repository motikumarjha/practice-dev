import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
    public static void main(String args[]) {

        Employee1 empObj = new Employee1(1, "moti", 2000);
        Employee1 empObj2 = new Employee1(1, "moti", 2000);
        Set<Employee1> employeeSet = new HashSet<Employee1>();
        employeeSet.add(empObj);
        employeeSet.add(empObj2);
        System.out.println(employeeSet);


    }

    }

    class Employee1 {
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


        public Employee1(int id, String name, double salary) {
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
