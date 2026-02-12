package Day_7;
import java.util.*;

class test{
    void trycatchtest() {
        try {
            Scanner sc = new Scanner(System.in);
            int i, n, a = 0;
            System.out.println("Enter limit of array:");
            n = sc.nextInt();
            int[] arr=new int[n];
            System.out.println("Enter array elements-");
            for (i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (i = 0; i <= n; i++) {
                a = a + arr[i];
            }
            System.out.println("Sum=" + a);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception Occured:" + e);
            System.out.println("Default Value = 0");
        }
    }
}
public class prog_7_1 {
    public static void main(String[] args){
        test ob=new test();
        ob.trycatchtest();
    }
}
