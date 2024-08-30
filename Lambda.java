import java.util.*;
import java.util.stream.Collectors;

public class Lambda {

    /*
     * Lambda function gives consise and readable way to write the code.
     * Its very helpfull especially when u are using Collections and streams.
     */

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("abc", 1500),
                new Employee("xyz", 1200),
                new Employee("lmn", 1600));

        employees.sort((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));

        employees.forEach(System.out::println);

        // ****************************************************************

        List<Employee> flist = employees.stream()
                .filter(emp -> emp.getSalary() > 1400)
                .collect(Collectors.toList());

        flist.forEach(System.out::println);

        // *****************************************************************************

        Double totalSalary = employees.stream()

                .mapToDouble(Employee::getSalary)
                .sum();

        System.out.println("Total Salary Sum Is :-" + totalSalary);
    }
}