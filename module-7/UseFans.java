//Mark Joiner, Assignment 7.2, 4/18/2025
import java.util.ArrayList;
import java.util.List;

public class UseFans {

    // Method to display a single Fan instance (without using toString)
    public static void displayFan(Fan fan) {
        if (fan.isOn()) {
            System.out.println("Fan is ON [Speed: " + fan.speedToString(fan.getSpeed()) +
                    ", Radius: " + fan.getRadius() +
                    ", Color: " + fan.getColor() + "]");
        } else {
            System.out.println("Fan is OFF [Radius: " + fan.getRadius() +
                    ", Color: " + fan.getColor() + "]");
        }
    }

    // Method to display a collection of Fans
    public static void displayFans(List<Fan> fans) {
        for (Fan fan : fans) {
            displayFan(fan);
        }
    }

    public static void main(String[] args) {
        // Create a collection of Fan instances
        List<Fan> fanList = new ArrayList<>();

        fanList.add(new Fan(Fan.SLOW, true, 5.0, "blue"));
        fanList.add(new Fan(Fan.MEDIUM, false, 6.5, "green"));
        fanList.add(new Fan(Fan.FAST, true, 7.0, "red"));
        fanList.add(new Fan(Fan.STOPPED, false, 4.0, "black"));
        fanList.add(new Fan(Fan.SLOW, true, 6.0, "white"));

        // Display all fans in the list
        System.out.println("All Fans:");
        displayFans(fanList);

        // Display one specific fan (e.g., first one)
        System.out.println("\nSingle Fan (first in list):");
        displayFan(fanList.get(0));
    }
}