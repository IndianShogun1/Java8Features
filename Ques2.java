import java.io.*;

class Employee implements Serializable {
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class Ques2 {
    public static void main(String[] args) throws Exception{

        Employee employee = new Employee("Shreyansh", 21);
        String filepath = "/home/shreyansh/IdeaProjects/Java8&Reflections/employee.ser";

        //Serializing the employee object.
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(filepath);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        //Deserializing the employee object.

        Employee deserializedEmployee;
        try{
            FileInputStream fileInputStream = new FileInputStream(filepath);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            deserializedEmployee = (Employee) objectInputStream.readObject();
            System.out.println(deserializedEmployee.getName() + " " + deserializedEmployee.getAge());
            objectInputStream.close();
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
