package Day_7;
import java.util.*;

class test2{
    void arthmeticexceptiont(){
        try{
            Scanner sc=new Scanner(System.in);
            int n;
            System.out.println("Enter a number:");
            n=sc.nextInt();
            int b=0;
            int c=n/b;
            System.out.println("Division = "+c);
        }
        catch(ArithmeticException e){
            System.out.println("Exception: "+e);
            System.out.println("Default Value = 0");
        }
    }
}

public class prog_7_2 {
    public static void main(String[] args){
        test2 ob=new test2();
        ob.arthmeticexceptiont();
    }
}
