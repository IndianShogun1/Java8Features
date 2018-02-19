import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ques6 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Neelesh",25);
        Employee employee2 = new Employee("Shreyansh",21);
        Employee employee3 = new Employee("Nova",24);
        Employee employee4 = new Employee("Nicole",25);
        Employee employee5 = new Employee("Archit",24);
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        List<Employee> result = employees.stream().filter(employee -> employee.getName().startsWith("N")).filter(employee -> employee.getAge() > 24).collect(Collectors.toList());
//        employees.stream().filter(employee -> employee.getName().startsWith("N")).filter(employee -> employee.getAge() > 24).forEach(employee -> System.out.println(employee.getName()));
//        List<Employee> result = employees.stream().filter(employee -> employee.getName().startsWith("N") && employee.getAge() > 24).collect(Collectors.toList());
        result.forEach((employee -> System.out.println(employee.getName())));
    }
}
