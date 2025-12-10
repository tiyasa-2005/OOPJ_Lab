import java.util.Scanner;
class Rectangle{
    int length;
    int breadth;
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }
    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextInt();
        System.out.print("Enter breadth: ");
        breadth = sc.nextInt();
    }
    void calculate() {
        int area = length * breadth;
        System.out.println("Area = "+area);
        int perimeter = 2 * (length + breadth);
        System.out.println("Perimeter = "+perimeter);
    }
}
public class prog_2_4 {
    public static void main(String[] args){
        Rectangle box=new Rectangle(0,0);
        box.read();
        box.calculate();
    }
}
