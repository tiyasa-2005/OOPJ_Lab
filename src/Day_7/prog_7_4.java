package Day_7;

import java.util.Scanner;

class HrsException extends Exception { }

class MinException extends Exception { }

class SecException extends Exception { }

class Time {
    int hrs, mins, sec;

    void input() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter hours, minutes and seconds:");
            hrs = sc.nextInt();
            mins = sc.nextInt();
            sec = sc.nextInt();
            if (hrs > 24 || hrs < 0 || mins > 60 || mins < 0 || sec > 60 || sec < 0) {
                System.out.println("Caught the exception");
            }
            else {
                System.out.println("Correct Time-> " + hrs + ":" + mins + ":" + sec);
                return;
            }

            try {
                if (hrs > 24 || hrs < 0)
                    throw new HrsException();
            }
            catch (HrsException e) {
                System.out.println("Exception occurred: InvalidHourException:hour is not greater than 24");
            }

            try {
                if (mins > 60 || mins < 0)
                    throw new MinException();
            }
            catch (MinException e) {
                System.out.println("Exception occurred: InvalidMinuteException:minute is not greater than 60");
            }

            try {
                if (sec > 60 || sec < 0)
                    throw new SecException();
            }
            catch (SecException e) {
                System.out.println("Exception occurred: InvalidSecondException:second is not greater than 60");
            }
        }
    }

class prog_7_4 {
    public static void main(String[] args) {
        Time ob = new Time();
        ob.input();
    }
}
