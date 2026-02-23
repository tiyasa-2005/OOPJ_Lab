package Day_9;
import java.io.*;
import java.util.Scanner;

public class prog_9_4 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the file: ");
        String filename = sc.nextLine();
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;
        try {
            File file = new File(filename);
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                lineCount++;
                charCount += line.length();
                String[] words = line.split(" ");
                if (!line.isEmpty()) {
                    wordCount += words.length;
                }
            }
            fileReader.close();
            System.out.println("No. of characters - " + charCount);
            System.out.println("No .of lines - " + lineCount);
            System.out.println("No . of words - " + wordCount);

        }
        catch (FileNotFoundException e) {
            System.out.println("Error: The file '" + filename + "' was not found.");
        }
    }
}
