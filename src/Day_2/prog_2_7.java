package Day_2;

import java.util.*;
class Rectangle2{
    int length;
    int breadth;
    Rectangle2() {
        length = 0;
        breadth = 0;
    }
    Rectangle2(int l, int b) {
        length = l;
        breadth = b;
    }
    int area() {
        return length * breadth;
    }
}

public class prog_2_7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Rectangle2 box = new Rectangle2();
        System.out.println("Area using default constructor: " + box.area());
        System.out.print("Enter length: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth: ");
        int breadth = sc.nextInt();
        Rectangle2 box2 = new Rectangle2(length, breadth);
        System.out.println("Area using parameterized constructor: " + box2.area());
    }
}
