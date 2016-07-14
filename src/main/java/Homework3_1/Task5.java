package Homework3_1;

import java.util.Random;

/**
 * create an array with 15 elements; find min element in array and display value and index
 */
public class Task5 {
    public static void main(String[] args) {
        int arr[] = new int[15];
        Random rn = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rn.nextInt(100) + 1;
            System.out.print(arr[i] + " | ");
        }
        int min=arr[0];
        int n = 0;
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i] < min) {
                min = arr[i];
                n=i;
            }
        }
        System.out.println();
        System.out.println(String.format("min value = %d", min));
        System.out.print(String.format("first index = %d",n));
    }
}

