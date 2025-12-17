import java.util.Scanner;

public class prog_1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first="";
        String last="";
        String name="";
        System.out.println("Enter first name");
        first=sc.next();
        System.out.println("Enter last name");
        last=sc.next();
        name=last+" "+first;
        System.out.println("Concatenated Name: "+name);
    }
}
