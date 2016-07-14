package Homework3_1;

import java.util.Random;

/**
 * create an array with 10 elements; rearrange all zeros to the end
 */
public class Task9 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Random rn = new Random();
        System.out.println("Initial array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rn.nextInt(4);
            System.out.print(arr[i] + " | ");
        }
        int sortedArr[] = new int[10];
        System.out.println();
        int j=0;
            for (int i = 0; i <arr.length ; i++) {
                if(arr[i] != 0) {
                   sortedArr[j]=arr[i];
                    j++;
                }
            }
        System.out.println("Sorted array:");
        for (int i = 0; i < sortedArr.length; i++) {
            System.out.print(sortedArr[i] + " | ");
        }
    }
}
