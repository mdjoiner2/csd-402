//Mark Joiner, Assignment 4.2, 4/5/2025
import java.util.Arrays;  // Now this works normally

public class ArrayAverages {

    public static short average(short[] array) {
        int sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short)(sum / array.length);
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0.0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        short[] shortArray = {1, 2, 3, 4};
        int[] intArray = {10, 20, 30, 40, 50};
        long[] longArray = {100, 200, 300, 400, 500, 600};
        double[] doubleArray = {1.5, 2.5, 3.5};

        System.out.println("Short array: " + Arrays.toString(shortArray));
        System.out.println("Average (short): " + average(shortArray));
        System.out.println();

        System.out.println("Int array: " + Arrays.toString(intArray));
        System.out.println("Average (int): " + average(intArray));
        System.out.println();

        System.out.println("Long array: " + Arrays.toString(longArray));
        System.out.println("Average (long): " + average(longArray));
        System.out.println();

        System.out.println("Double array: " + Arrays.toString(doubleArray));
        System.out.println("Average (double): " + average(doubleArray));
    }
}
//Sources used:https://www.geeksforgeeks.org/method-overloading-in-java/# and ChatGPT for assistance

