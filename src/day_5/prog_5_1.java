package day_5;

interface Motor{
    int capacity=1000;
    void run();
    void consume();
}

class WashingMachine implements Motor{
    public void run(){
        System.out.println("The Washing Machine is running");
    }
    public void consume(){
        System.out.println("The Washing Machine is consuming electricity");
    }
    void display(){
        System.out.println("Capacity of Motor = "+capacity);
    }
}

public class prog_5_1 {
    public static void main(String[] args){
        WashingMachine ob=new WashingMachine();
        ob.display();
    }
}