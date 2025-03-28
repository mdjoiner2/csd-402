//Mark Joiner, Assignment 3.2, 3/28/25
public class ForLoop {
    public static void main(String[] args) {
        //This tells the program how many rows will be used
        int totalRows = 7;
        for (int i = 1; i <= totalRows; i++) {
            
            //This block prints out the leading spaces
            for (int space = 1; space <= (totalRows - i); space++) {
                System.out.print("   ");
            }

            //This block prints the ascending numbers
            int num = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num *= 2;
            }

            //This block prints out the descending numbers
            num /= 2; 
            for (int k = 1; k < i; k++) {
                num /= 2;
                System.out.print(num + " ");
            }

            //This line prints out the "@" symbol next to every line
            System.out.println("@");
        }
    }
}
//Sources used: https://www.w3schools.com/java/java_for_loop_nested.asp, https://www.programiz.com/java-programming/nested-loop