package day_5;
import java.util.*;

interface Help{
    void earnings();
    void deductions();
    void bonus();
}

abstract class Manager implements Help{
    double basic;
    double da, hra, pf;
    Manager(double ba) {
        basic = ba;
    }
    public void earnings(){
        da=0.8*basic;
        hra=0.15*basic;
        double total=basic+da+hra;
        System.out.println("Earnings = " +total);
    }
    public void deductions(){
        double ded=0.12*basic;
        System.out.println("Deductions = " +ded);
    }
}

class Substaff extends Manager{
    Substaff(double basic){
        super(basic);
    }
    public void bonus(){
        double bon=0.50*basic;
        System.out.println("Bonus = " +bon);
    }
}

public class prog_5_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary of Staff: ");
        double bs=sc.nextDouble();
        Substaff ob=new Substaff(bs);
        ob.earnings();
        ob.deductions();
        ob.bonus();
    }
}
