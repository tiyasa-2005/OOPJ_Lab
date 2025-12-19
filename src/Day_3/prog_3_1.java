package Day_3;
import java.util.*;

class sheet{
    int length;
    int breadth;
    void area()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length and breadth of sheet:");
        length=sc.nextInt();
        breadth=sc.nextInt();
        int a=0;
        a=length*breadth;
        System.out.println("Cost = "+(40*a));
    }
}

class box extends sheet{
    int height;
    void volume() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length, breadth and height of sheet:");
        length=sc.nextInt();
        breadth=sc.nextInt();
        height=sc.nextInt();
        int v = 0;
        v=length*breadth*height;
        System.out.println("Cost = "+(60*v));
    }
}

public class prog_3_1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 0 for sheet and 1 for box:");
        int i=sc.nextInt();
        if(i==0)
        {
            sheet obj=new sheet();
            obj.area();
        } else if (i==1) {
            box mybox=new box();
            mybox.volume();
        }
        else {
            System.out.println("Invalid Input");
            sc.close();
        }
    }
}
