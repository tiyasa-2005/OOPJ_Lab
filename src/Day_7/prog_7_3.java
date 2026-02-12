package Day_7;
import java.util.*;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message)
    {
        super(message);
    }
}

class test3 {
    void processInput() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            if (num < 0) {
                throw new NegativeNumberException("Number should be positive");
            }
            else {
                System.out.println("Double value: " + (num * 2));
            }
        }
        catch (NegativeNumberException e) {
            System.out.println("Exception occurred: " + e);
        }
        catch (Exception e) {
            System.out.println("Exception occured: " + e);
        }
        finally {
            System.out.println("Program Completed");
        }
    }
}

public class prog_7_3 {
    public static void main(String[] args) {
        test3 ob = new test3();
        ob.processInput();
    }
}
