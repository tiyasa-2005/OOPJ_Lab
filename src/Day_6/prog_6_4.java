package Day_6;

class Bank {
    private String bankName = "Global Trust Bank";
    private static double baseRate = 2.5;
    public static class InterestCalculator {
        public static double calculateSimpleInterest(double principal, int years) {
            double totalRate = baseRate + 1.2;
            return (principal * years * totalRate) / 100;
        }
    }
}

public class prog_6_4 {
    public static void main(String[] args) {
        double interest = Bank.InterestCalculator.calculateSimpleInterest(5000, 3);
        System.out.println("Simple Interest calculated: " + interest);
    }
}
