package Homework3;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Random rn = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rn.nextInt(100) + 1;
            System.out.print(arr[i] + " | ");
        }
        int min=100;
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
