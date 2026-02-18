package Day_5;
import java.util.*;

interface Employee{
    void getDetails();
}

interface Manager1 extends Employee{
    void getDeptDetails();
}

class Head implements Manager1{
    String Ename;
    long Empid;
    long Deptid;
    String Deptname;
    public void getDetails(){
        Scanner sc1=new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        Ename=sc1.nextLine();
        System.out.print("Enter Employee ID: ");
        Empid=sc1.nextLong();
    }
    public void getDeptDetails(){
        Scanner sc2=new Scanner(System.in);
        System.out.print("Enter Department Name: ");
        Deptname=sc2.nextLine();
        System.out.print("Enter Department ID: ");
        Deptid=sc2.nextLong();
    }
    void display(){
        System.out.println("\nEmployee Details:- ");
        System.out.println("Name = "+Ename);
        System.out.println("ID = "+Empid);
        System.out.println("Department Name = "+Deptname);
        System.out.println("Department ID = "+Deptid);
    }
}

public class prog_5_3 {
    public static void main(String[] args){
        Head ob=new Head();
        ob.getDetails();
        ob.getDeptDetails();
        ob.display();
    }
}
