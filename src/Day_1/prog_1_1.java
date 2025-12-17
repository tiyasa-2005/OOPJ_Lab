package Day_1;

import java.util.*;
class details{
    String name;
    long roll;
    String sec;
    String branch;
}

public class prog_1_1 {
    public static void main(String[] args){
        details box=new details();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name:");
        box.name=sc.nextLine();
        System.out.println("Enter Roll Number:");
        box.roll=sc.nextLong();
        sc.nextLine();
        System.out.println("Enter Section:");
        box.sec=sc.nextLine();
        System.out.println("Enter Branch:");
        box.branch=sc.nextLine();
        System.out.println("Name: "+box.name+"\nRoll Number: "+box.roll+"\nSection: "+box.sec+"\nBranch: "+box.branch);
    }
}
