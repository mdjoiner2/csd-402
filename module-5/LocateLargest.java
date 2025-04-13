//Mark Joiner, Assignment 5.2, 4/12/25
public class LocateLargest {

    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = new int[2];
        double max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }

    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = new int[2];
        int max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }

    public static void main(String[] args) {
        double[][] dArray = {
            {1.1, 4.2, 3.3},
            {5.5, 2.2, 8.8}
        };

        int[][] iArray = {
            {3, 7, 1},
            {9, 4, 0}
        };

        int[] largestDouble = locateLargest(dArray);
        int[] largestInt = locateLargest(iArray);

        System.out.println("Largest in double[][] at: [" + largestDouble[0] + ", " + largestDouble[1] + "]");
        System.out.println("Largest in int[][] at: [" + largestInt[0] + ", " + largestInt[1] + "]");
    }
}
