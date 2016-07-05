package Homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter height in cm");
        int height = Integer.parseInt(br.readLine());
        System.out.println("Enter weight in kg");
        int weight = Integer.parseInt(br.readLine());
        int optimalWeight = height-100;
        if (weight>optimalWeight){
            System.out.println(String.format("You should lose %d kg", weight-optimalWeight));
        }
        else if (weight==optimalWeight){
            System.out.println("Your weight is optimal");
        }
        else {
            System.out.println(String.format("You should gain %d kg", optimalWeight-weight));
        }
    }
}
