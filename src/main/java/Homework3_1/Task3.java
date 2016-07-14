package Homework3_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * create an array with 15 elements of 3 ways
 */
public class Task3 {
    public static void main(String[] args) throws IOException {
        int arrList[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int arrKeyboard[] = new int[15];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter you array");
        for (int i = 0; i < arrKeyboard.length; i++) {
            arrKeyboard[i] = Integer.parseInt(br.readLine());
        }
        int arrRandom[] = new int[15];
        Random rn = new Random();
        for (int i = 0; i < arrRandom.length; i++) {
            arrRandom[i] = rn.nextInt(100) + 1;
        }
        System.out.println();
        System.out.println("Array A:");
        arrayPrinter(arrList);
        System.out.println();
        System.out.println("Array B:");
        arrayPrinter(arrKeyboard);
        System.out.println();
        System.out.println("Array C:");
        arrayPrinter(arrRandom);
    }

    /**
     * prints all array elements
     * @param arr array to print
     */
    static void arrayPrinter (int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
        }
    }
}
