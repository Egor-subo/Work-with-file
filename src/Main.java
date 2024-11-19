import java.io.IOException;
import java.util.Date;
public class Main {
    public static void main(String[] args) throws IOException {
     String fileName = "test.txt";
     Date date = new Date();
    try {
    System.out.println("Созданный файл: " + Task.CreateOrOpenFile(fileName));
        System.out.println("Файл создан: " + date.toString());
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
        Task.WriteInFile(fileName,"!@#$%^&*()");
        System.out.println("Данные из файла:" + Task.ReadDataFile(fileName));
        try {
        }
    }

}








