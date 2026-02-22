package Day_9;
import java.io.*;
import java.util.Scanner;

public class prog_9_2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter source file name: ");
        String src = sc.next();
        System.out.print("Enter destination file name: ");
        String dest = sc.next();
        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dest))
        {
            int b;
            while ((b = fis.read()) != -1)
                fos.write(b);
            System.out.println("File Copied via Byte Stream.");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
