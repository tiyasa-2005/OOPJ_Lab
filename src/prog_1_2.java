import java.util.*;
public class prog_1_2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int marks;
        char grade='\0';
        System.out.println("Enter marks within 100");
        marks=sc.nextInt();
        if(marks>=90 && marks<=100)
            grade='0';
        else if(marks>=80 && marks <90)
            grade='E';
        else if(marks>=70 && marks <80)
            grade='A';
        else if(marks>=60 && marks <70)
            grade='B';
        else if(marks>=50 && marks <60)
            grade='C';
        System.out.println("Grade = "+grade);
    }
}
