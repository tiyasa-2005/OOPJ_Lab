package Day_2;

public class prog_2_1 {
    public static void main(String[] args){
        System.out.println("Enter 10 values");
        int even=0;
        int odd=0;
        for(int i=0;i<10;i++)
        {
            int num=Integer.parseInt(args[i]);
            if(num%2==0)
                even++;
            else
                odd++;
        }
        System.out.println("Even Numbers = "+even);
        System.out.println("Odd Numbers = "+odd);
    }
}
