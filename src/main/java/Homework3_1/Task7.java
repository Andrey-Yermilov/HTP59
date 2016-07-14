package Homework3_1;

import java.util.Random;

/**
 * create an array with 10 elements; count sum of elements before 1st zero
 */
public class Task7 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Random rn = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rn.nextInt(5);
            System.out.print(arr[i] + " | ");
        }
        System.out.println();
        int sum = arr[0];
        if (sum==0){
            System.out.println(String.format("sum = %d", sum));
        }
        else{
            for (int i = 1; i <arr.length ; i++) {
                if(arr[i] != 0) {
                    sum+=arr[i];
                }
                else{
                    break;
                }
            }
            System.out.println(String.format("sum = %d", sum));
        }
    }
}