package Homework3;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int arr[] = new int[15];
        Random rn = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rn.nextInt(3) + 1;
            System.out.print(arr[i] + " | ");
        }
        int max=arr[0];
        int n = 0;
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i] > max) {
                max = arr[i];
                n=i;
            }
        }
        System.out.println();
        System.out.println(String.format("max value = %d", max));
        System.out.print(String.format("first index = %d",n));

    }
}

