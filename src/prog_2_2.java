import java.util.*;

class Counter {
    static int count = 0;
    Counter() {
        count++;   // increments when object is created
    }
}

public class prog_2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of objects to create: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            new Counter();
        }
        System.out.println("Number of objects created = " + Counter.count);
    }
}
