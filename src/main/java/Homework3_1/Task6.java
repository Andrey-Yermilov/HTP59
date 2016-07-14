package Homework3_1;

import java.util.Random;

/**
 * create an array with 10 elements; count number of negative elements
 */
public class Task6 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Random rn = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rn.nextInt(201) - 100;
            System.out.print(arr[i] + " | ");
        }
        int numberOfNegatives = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] < 0) {
                numberOfNegatives++;
            }
        }
        System.out.println();
        System.out.println(String.format("number of negative elements = %d", numberOfNegatives));
    }
}