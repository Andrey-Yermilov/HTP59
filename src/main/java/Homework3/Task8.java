package Homework3;

import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Random rn = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rn.nextInt(5);
            System.out.print(arr[i] + " | ");
        }
        System.out.println();
        int mult = arr[0];
        if (mult==0){
            System.out.println(String.format("result = %d", mult));
        }
        else{
            for (int i = 1; i <arr.length ; i++) {
                if(arr[i] != 0) {
                    mult*=arr[i];
                }
                else{
                    break;
                }
            }
            System.out.println(String.format("result = %d", mult));
        }
    }
}