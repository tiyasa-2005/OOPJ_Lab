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
        try (FileInputStream fis1 = new FileInputStream(file1);
             FileInputStream fis2 = new FileInputStream(file2)) {

            int byte1, byte2;
            long position = 1;
            boolean areEqual = true;

            while ((byte1 = fis1.read()) != -1 && (byte2 = fis2.read()) != -1) {
                if (byte1 != byte2) {
                    System.out.println("Files differ at byte position: " + position);
                    areEqual = false;
                    break;
                }
                position++;
            }
            if (areEqual) {
                if (fis1.read() != -1 || fis2.read() != -1) {
                    System.out.println("Files differ at byte position: " + position);
                }
                else {
                    System.out.println("Two files are equal");
                }
            }

        }
        catch (FileNotFoundException e) {
            System.out.println("Error: One or both files could not be found.");
        }
        catch (IOException e) {
            System.out.println("Error reading files: " + e.getMessage());
        }
    }
}
