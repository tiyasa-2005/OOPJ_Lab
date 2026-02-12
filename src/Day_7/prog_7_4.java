package Day_7;

import java.util.*;

class HrsException extends Exception {
    public HrsException(String message) {
        super(message);
    }
}

class MinException extends Exception {
    public MinException(String message) {
        super(message);
    }
}

//class SecException extends Exception {
//    public SecException(String message) {
//        super(message);
//    }
//}
//
//class Time {
//    int hrs, mins, sec;
//
//
//    void input() {
//        try {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter hours, minutes and seconds:");
//            hrs = sc.nextInt();
//            mins = sc.nextByte();
//            sec = sc.nextInt();
//        }
//        if (hrs > 24 && hrs < 0) {
//            throw new HrsException("Hours should be more than 0 and less than 24");
//        }
//        if (mins > 60 && mins < 0) {
//            throw new MinException("Minutes should be more than 0 and less than 60");
//        }
//        if (sec > 60 && sec < 0) {
//            throw new SecException("Seconds should be more than 0 and less than 60");
//        }
//
//    catch(HrsException e1){
//            System.out.println("Exception occurred: " + e1);
//        }
//                MinException e2)
//        SecException e3
//
//
//                {
//
//    })
//
//        {
//            System.out.println("Exception occurred: " + e2);
//        }
//    catch(
//
//                {
//                        System.out.println("Exception occurred: " + e3);
//    })
//    }
//}
//}
//
//public class prog_7_4 {
//    public static void main(String[] args) {
//        Time ob = new Time();
//        ob.input();
//    }
//}
