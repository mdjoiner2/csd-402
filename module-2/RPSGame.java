//Mark Joiner, Assignment 2.2, 3/27/2025

import java.util.Random;
import java.util.Scanner;

public class RPSGame {
    public static void main(String[] args) {
        // This gives the names a value
        String rname = "Rock";
        String pname = "Paper";
        String sname = "Scissors";

        // This gets the users input for the game
        Scanner myObj = new Scanner(System.in);
        System.out.println(" Welcome to Rock, Paper, Scissors! Please choose your option! 1. Rock 2. Paper 3. Scissors: ");
        int usernumber = myObj.nextInt();

        // This chooses the computers choice (1, 2, or 3).
        int randomnumber = (int)(Math.random() * 3) + 1;

        // This converts the numbers to move names, and displays an error message if the wrong number is chosen
        String userChoice = "";
        if (usernumber == 1) {
            userChoice = rname;
        } else if (usernumber == 2) {
            userChoice = pname;
        } else if (usernumber == 3) {
            userChoice = sname;
        } else {
            System.out.println("Invalid input! Please choose 1, 2, or 3.");
            return;
        }

        String computerChoice = "";
        if (randomnumber == 1) {
            computerChoice = rname;
        } else if (randomnumber == 2) {
            computerChoice = pname;
        } else if (randomnumber == 3) {
            computerChoice = sname;
        }

        // This will display both selections
        System.out.println("You have chosen: " + userChoice);
        System.out.println("The Computer chose: " + computerChoice);
        
        // This determines the winner based on the rules of rock, paper, scissors
        if (usernumber == randomnumber) {
            System.out.println("The game is tied! Nobody wins!");
        } else if ((usernumber == 1 && randomnumber == 3) ||  // Rock beats Scissors
                   (usernumber == 2 && randomnumber == 1) ||  // Paper beats Rock
                   (usernumber == 3 && randomnumber == 2)) {  // Scissors beats Paper
            System.out.println("Congratulations! You win!");
        } else {
            System.out.println("The computer has won! Try Again!");
        }
    }
}
//Sources used: https://www.w3schools.com/java/java_variables.asp, https://www.geeksforgeeks.org/operators-in-java/, and ChatGPT (for aid, not actual code writing). 