package Day_3;
import java.util.*;
class plate{
    int length;
    int width;
    plate(int l, int b){
        length=l;
        width=b;
    }
    void display(){
        System.out.println("Length = "+length+"\nBreadth = "+width);
        System.out.println();
    }
}
class box1 extends plate{
    int height;
    box1(int l,int b,int h){
        super(l,b);
        height=h;
    }
    void display(){
        System.out.println("Length = "+length+"\nBreadth = "+width+"\nHeight = "+height);
        System.out.println();
    }
}
class woodbox extends box1{
    int thick;
    woodbox(int l,int b,int h,int t){
        super(l,b,h);
        thick=t;
    }
    void display(){
        System.out.println("Length = "+length+"\nBreadth = "+width+"\nHeight = "+height+"\nThickness = "+thick);
        System.out.println();
    }
}

public class prog_3_2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter dimensions length, breadth, height, :");
        int l=sc.nextInt();
        int b=sc.nextInt();
        int h=sc.nextInt();
        int t=sc.nextInt();
        System.out.println("Dimensions of plate:-");
        plate obj1=new plate(l,b);
        obj1.display();
        System.out.println("Dimensions of box:-");
        box1 obj2=new box1(l,b,h);
        obj2.display();
        System.out.println("Dimensions of woodbox:-");
        woodbox obj3=new woodbox(l,b,h,t);
        obj3.display();
    }
}
