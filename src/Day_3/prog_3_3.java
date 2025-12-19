package Day_3;
import java.util.*;
class Account{
    long acc_no;
    long balance;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter account number and balance:");
        acc_no=sc.nextLong();
        balance=sc.nextLong();
    }
    void disp(){
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}
class Person extends Account{
    String name;
    long aadhar_no;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name and Aadhar Number:");
        name=sc.nextLine();
        aadhar_no=sc.nextLong();
    }
    void disp(){
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

public class prog_3_3 {
    public static void main(String[] args){
        Person p[] = new Person[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details of person " + (i + 1));
            p[i] = new Person();
            p[i].input();
            p[i].input();
        }

        System.out.println("Details of Three Persons");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nPerson " + (i + 1));
            p[i].disp();
        }
    }
}
