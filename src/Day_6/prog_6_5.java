package Day_6;
interface Greeting {
    void sayHello();
}

public class prog_6_5 {
    public static void main(String[] args) {
        Greeting myGreeting = new Greeting() {
            public void sayHello() {
                System.out.println("Hello! This is a custom greeting from an Anonymous Inner Class.");
            }
        };
        myGreeting.sayHello();
    }
}
