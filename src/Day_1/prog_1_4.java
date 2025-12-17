package Day_1;

import java.util.Scanner;

public class prog_1_4 {
    static int reverse(int x)
    {
        int r,rev=0;
        for(;x>0;x=x/10)
        {
            r=x%10;
            rev=rev*10+r;
        }
        return rev;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a number");
        num=sc.nextInt();
        int rev=reverse(num);
        if(rev==num)
            System.out.println(num+" is a Palindrome Number");
        else
            System.out.println(num+" is not a Palindrome Number");
    }
}

