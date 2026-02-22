package Day_9;
import java.io.*;
import java.util.Scanner;

public class prog_9_3 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first binary file: ");
        String file1 = sc.nextLine();
        System.out.print("Enter second binary file: ");
        String file2 = sc.nextLine();
        try (BufferedInputStream bis1 = new BufferedInputStream(new FileInputStream("file1.dat"));
             BufferedInputStream bis2 = new BufferedInputStream(new FileInputStream("file2.dat")))
        {
            int b1, b2, pos = 0;
            boolean diffFound = false;
            while ((b1 = bis1.read()) != -1)
            {
                b2 = bis2.read();
                if (b1 != b2) {
                    System.out.println("Two files are not equal: byte position " + pos);
                    diffFound = true;
                    break;
                }
                pos++;
            }
            if (!diffFound)
                System.out.println("Two files are equal");
        }
        catch (IOException e) {
            System.out.println("Error reading files.");
        }
    }
}
