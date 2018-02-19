import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ques1 {
    public static void main(String[] args) {
        String source = "/home/shreyansh/output";
        String destination = "output";
        try {
            FileInputStream fileInputStream = new FileInputStream(source);
            FileOutputStream fileOutputStream = new FileOutputStream(destination);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = fileInputStream.read(buffer)) > 0) {
                fileOutputStream.write(buffer, 0, length);
            }
            fileInputStream.close();
            fileOutputStream.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
