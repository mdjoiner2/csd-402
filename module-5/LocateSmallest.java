//Mark Joiner, Assignment 5.2, 4/12/25
public class LocateSmallest {

    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = new int[2];
        double min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }

    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = new int[2];
        int min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
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
            {5.5, 2.2, 0.5}
        };

        int[][] iArray = {
            {3, 7, 1},
            {9, 4, 0}
        };

        int[] smallestDouble = locateSmallest(dArray);
        int[] smallestInt = locateSmallest(iArray);

        System.out.println("Smallest in double[][] at: [" + smallestDouble[0] + ", " + smallestDouble[1] + "]");
        System.out.println("Smallest in int[][] at: [" + smallestInt[0] + ", " + smallestInt[1] + "]");
    }
}
