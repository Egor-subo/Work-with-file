import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
     String fileName = "test.txt";
    try {
    System.out.println("Созданный файл: " + Task.CreateOrOpenFile(fileName));
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
        Task.WriteInFile(fileName,"!@#$%^&*()");
        System.out.println("Данные из файла:" + Task.ReadDataFile(fileName));
        /*System.out.println("Данные удалены:" + Task.ClearFile(fileName));*/
    }



}








