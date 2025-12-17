package Day_2;

import java.util.*;
class Student{
    String name;
    long roll;
    float cgpa;
}
public class prog_2_5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter number of students");
        n=sc.nextInt();
        Student[] box=new Student[n];
        for(int i=0;i<n;i++){
            box[i] = new Student();
            System.out.println("Enter student "+(i+1)+" Day_1.details");
            sc.nextLine();
            box[i].name= sc.nextLine();
            box[i].roll= sc.nextLong();
            box[i].cgpa= sc.nextFloat();
        }
        System.out.println("Day_2.Student Details:-");
        for(int i = 0; i < n; i++){
            System.out.println("Name: " + box[i].name);
            System.out.println("Roll: " + box[i].roll);
            System.out.println("CGPA: " + box[i].cgpa);
            System.out.println();
        }
        int min=0;
        for(int i = 0; i < n; i++)
        {
            if(box[i].cgpa<box[min].cgpa)
                min=i;
        }
        System.out.println("Day_2.Student "+box[min].name+" has lowest cgpa");
    }
}
