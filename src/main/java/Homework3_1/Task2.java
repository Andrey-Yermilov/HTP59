package Homework3_1;

import java.util.Random;

/**
 * create an array with 10 int elements; print min and max values
 */
public class Task2 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Random rn = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rn.nextInt(100) + 1;
            System.out.print(arr[i] + " | ");
        }
        int min=101;
        int max=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println();
        System.out.println(String.format("min value = %d", min));
        System.out.println(String.format("max value = %d", max));
    }
}
