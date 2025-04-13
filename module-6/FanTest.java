//Mark Joiner, Assignment 6.2, 4/13/2025
public class FanTest {
    public static void main(String[] args) {
        // Using default constructor
        Fan fan1 = new Fan();
        System.out.println("Fan 1: " + fan1);

        // Using argument constructor
        Fan fan2 = new Fan(Fan.FAST, true, 10.5, "blue");
        System.out.println("Fan 2: " + fan2);

        // Modify fan1 using setters
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setOn(true);
        fan1.setRadius(8.0);
        fan1.setColor("red");

        System.out.println("Updated Fan 1: " + fan1);
    }
}
