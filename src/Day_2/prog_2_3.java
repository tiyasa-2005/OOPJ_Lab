package Day_2;

import java.util.Scanner;

class file_box{
    int length;
    int width;
    int height;

    void volume(int a,int b,int c) {
        int vol = a * b * c;
        System.out.println("Volume = " + vol);
    }
}

public class prog_2_3 {
    public static void main(String[] args){
        file_box mybox = new file_box();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length, width and height");
        mybox.length = sc.nextInt();
        mybox.width = sc.nextInt();
        mybox.height = sc.nextInt();

        mybox.volume(mybox.length, mybox.width, mybox.height); // FIXED
    }
}

