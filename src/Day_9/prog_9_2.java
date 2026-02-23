package Day_9;
import java.io.*;
import java.util.Scanner;

public class prog_9_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the source file name: ");
        String sourceFile = sc.nextLine();
        System.out.print("Enter the destination file name: ");
        String destFile = sc.nextLine();
        copyUsingByteStream(sourceFile, destFile);
        copyUsingCharacterStream(sourceFile, destFile);
        System.out.println("File Copied successfully using both methods.");
    }

    public static void copyUsingByteStream(String source, String dest) {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(dest)) {

            int b;
            while ((b = fis.read()) != -1)
                fos.write(b);
        }
        catch (IOException e) {
            System.out.println("Byte Stream Error: " + e.getMessage());
        }
    }

    public static void copyUsingCharacterStream(String source, String dest) {
        try (FileReader fr = new FileReader(source);
             FileWriter fw = new FileWriter(dest)) {

            int c;
            while ((c = fr.read()) != -1) {
                fw.write(c);
            }
        }
        catch (IOException e) {
            System.out.println("Character Stream Error: " + e.getMessage());
        }
    }
}
