import java.util.Arrays;
import java.util.List;

public class Ques4 {
    public static void main(String[] args) {
        int number = 4;
        List<Integer> table = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        table.forEach((tableElement) -> System.out.println(tableElement * number) );
    }
}
