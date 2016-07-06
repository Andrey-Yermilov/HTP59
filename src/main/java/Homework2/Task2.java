package Homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * method compares 2  numbers
 */
public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first number");
        double  firstNumber = Double.parseDouble(br.readLine());
        System.out.println("Enter second number");
        double secondNumber = Double.parseDouble(br.readLine());
        if (firstNumber > secondNumber) {
            System.out.println(String.format("%f is greater than %f", firstNumber, secondNumber));
        } else if (firstNumber < secondNumber) {
            System.out.println(String.format("%f is less than %f", firstNumber, secondNumber));
        }
        else   {
            System.out.println("Numbers are equal");
        }
    }
}
