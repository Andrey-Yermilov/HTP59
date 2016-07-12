package Homework3;

import java.util.Random;

public class Task9 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Random rn = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rn.nextInt(5);
            System.out.print(arr[i] + " | ");
        }
        int sortedArr[] = new int[10];
        System.out.println();
        int j=0;
            for (int i = 1; i <arr.length ; i++) {
                if(arr[i] != 0) {
                   sortedArr[j]=arr[i];
                    j++;
                }
            }
        for (int i = 0; i < sortedArr.length; i++) {
            System.out.print(sortedArr[i] + " | ");
        }
    }
}
