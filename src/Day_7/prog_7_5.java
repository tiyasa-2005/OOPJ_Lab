package Day_7;

class CheckArgument extends Exception {
}

public class prog_7_5 {
    public static void main(String[] args) {
        int s;
        try {
            if (args.length < 4)
                throw new CheckArgument();
            else{
                int a=Integer.parseInt(args[0]);
                int b=Integer.parseInt(args[1]);
                int c=Integer.parseInt(args[2]);
                int d=Integer.parseInt(args[3]);
                s=(a*a)+(b*b)+(c*c)+(d*d);
                System.out.println("Addition = "+s);
            }
        }
        catch (CheckArgument e) {
            System.out.println("Exception occurred - CheckArgument");
        }
    }
}
