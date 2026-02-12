package Day_6.Marketing;

import Day_6.General.employee;
import java.util.*;

public class sales extends employee {
    public sales(double basic, long empid, String ename)
    {
        super(basic, empid, ename);
    }

    public double tallowance()
    {
        return 0.05 * earning();
    }
}

class prog_6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee ID:");
        long id = sc.nextLong();
        sc.nextLine();

        System.out.println("Enter Employee Name:");
        String name = sc.nextLine();

        System.out.println("Enter Basic Salary:");
        double bas = sc.nextDouble();

        sales person = new sales(bas, id, name);

        double earn = person.earning();
        double ta = person.tallowance();
        double total = earn + ta;

        System.out.println("\nSalary Slip");
        System.out.println("Employee ID   : " + id);
        System.out.println("Total Earnings: " + total);
    }
}