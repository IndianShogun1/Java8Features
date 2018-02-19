import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Ques3 {
    public static void main(String[] args) {
        Employee employee = new Employee("Shreyansh", 21);
        Class employeeClass = employee.getClass();
        Field[] fields = employeeClass.getDeclaredFields();
        Method[] methods = employeeClass.getMethods();
        for (Field f : fields) {
            System.out.println(f);
        }
        for (Method m : methods) {
            System.out.println(m);
        }
    }
}
