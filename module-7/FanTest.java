//Mark Joiner, Assignment 7.2, 4/18/2025
public class FanTest {

    public static void main(String[] args) {
        Fan testFan = new Fan(Fan.FAST, true, 8.0, "silver");

        System.out.println("Testing Fan Object:");
        System.out.println("Speed: " + testFan.speedToString(testFan.getSpeed()));
        System.out.println("Is On: " + testFan.isOn());
        System.out.println("Radius: " + testFan.getRadius());
        System.out.println("Color: " + testFan.getColor());
    }
