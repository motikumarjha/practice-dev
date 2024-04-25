import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeesData {

    public static void main(String[] args){
        List<Employees> employees = Arrays.asList(
                new Employees("Vijay Reddy", 30000),
                new Employees("Amit Shah", 60000),
                new Employees("Sara Khan", 50000),
                new Employees("Amit Shah", 40000));

        getMaxSalaryAndSortedName(employees);

        getMaxSalaryAndSortedName01(employees);
    }
    public static List<Employees> getMaxSalaryAndSortedName(List<Employees> employees){
        List<Employees>  empSorted = employees.stream()
               // .map((a,b) -> employees.get(0).getName() - employees.get(0).getName())
                .sorted(Comparator.comparing(Employees::getName)
                .thenComparing(Employees::getSalary)).collect(Collectors.toList());

            System.out.println("" + empSorted);
            return empSorted;
    }

    public static List<Employees> getMaxSalaryAndSortedName01(List<Employees> employees){
           List<Employees> newEmpList = employees.stream()
                   .sorted((o1, o2) -> o1.getName().length()-(o2.getName().length()))
                   //.sorted(Comparator.comparing(Employees::getName))

                   .filter(n -> n.getSalary()>40000)
                   .collect(Collectors.toList());

           System.out.println("" + newEmpList);
           return newEmpList;
    }
}
// ram mohan shayam
