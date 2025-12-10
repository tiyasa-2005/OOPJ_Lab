import java.util.*;

class Subtract {
    void subtract(int a, int b) {
        System.out.println("Result = " + (a - b));
    }
    void subtract(float a, float b) {
        System.out.println("Result = " + (a - b));
    }
    void subtract(int a, int b, int c) {
        System.out.println("Result = " + (a - b - c));
    }
    void subtract(double a, int b) {
        System.out.println("Result = " + (a - b));
    }
}

public class prog_2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Subtract obj = new Subtract();
        System.out.println("Choose Subtraction Operation:");
        System.out.println("1. subtract(int, int)");
        System.out.println("2. subtract(float, float)");
        System.out.println("3. subtract(int, int, int)");
        System.out.println("4. subtract(double, int)");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
                System.out.print("Enter two integers: ");
                int p = sc.nextInt();
                int q = sc.nextInt();
                obj.subtract(p,q);
                break;
            case 2:
                System.out.print("Enter two float values: ");
                float f1 = sc.nextFloat();
                float f2 = sc.nextFloat();
                obj.subtract(f1, f2);
                break;
            case 3:
                System.out.print("Enter three integers: ");
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = sc.nextInt();
                obj.subtract(x, y, z);
                break;
            case 4:
                System.out.print("Enter one double and one int: ");
                double d = sc.nextDouble();
                int i = sc.nextInt();
                obj.subtract(d, i);
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}

