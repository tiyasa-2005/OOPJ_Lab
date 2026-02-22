package Day_9;
import java.io.*;
import java.util.Scanner;

public class prog_9_1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter RollNo, Name, Subject, Marks:");
            String details = sc.nextLine();

            System.out.print("Enter filename: ");
            String filename = sc.next();

            FileWriter fw = new FileWriter(filename);
            fw.write(details);

            System.out.println("Reading back from file - ");
            BufferedReader br = new BufferedReader(new FileReader(filename));
            System.out.println(br.readLine());
            br.close();
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
