package Homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter year");
        int year = Integer.parseInt(br.readLine());
        if (((year%4==0) && (year%100!=0)) || (year%400==0)){
            System.out.println(String.format("%d is a leap year",year));
        }
        else {
            System.out.println(String.format("%d is not a leap year",year));
        }
    }
}
