import java.util.Scanner;

public class JouleCalc {
    public static void main(String[] args) {
        int x, y, z;
        Scanner myObj = new Scanner(System.in); //User inputs amounts of water and temps
        System.out.println("Enter Amount of Water (in kilograms): ");
        x = myObj.nextInt();

        System.out.println("Enter initial temperature of the water: ");
        y = myObj.nextInt();

        System.out.println("Enter final temperature of the water: ");
        z = myObj.nextInt();

        int energy = x*(z-y)*4184; //System calculates the entered info into Joules
        System.out.println("The Result in Joules is: " + energy);
    }
}