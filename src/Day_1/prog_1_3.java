package Day_1;

import java.util.*;
public class prog_1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day_no;
        String day = "";
        System.out.println("Enter day number within 31");
        day_no = sc.nextInt();
        if (day_no > 31) {
            System.out.println("Invalid Input");
            sc.close();
        } else {
            int rem = day_no % 7;
            switch (rem) {
                case 0:
                    day = "Sunday";
                    break;
                case 1:
                    day = "Monday";
                    break;
                case 2:
                    day = "Tuesday";
                    break;
                case 3:
                    day = "Wednesday";
                    break;
                case 4:
                    day = "Thursday";
                    break;
                case 5:
                    day = "Friday";
                    break;
                case 6:
                    day = "Saturday";
                    break;
                default:
                    System.out.println("Invalid Input");
            }
            System.out.println("Day = " + day);
        }
    }
}
