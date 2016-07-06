package Homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first number");
        double firstNumber = Double.parseDouble(br.readLine());
        System.out.println("Enter second number");
        double secondNumber = Double.parseDouble(br.readLine());
        System.out.println(String.format("Quotient is %f",divider(firstNumber, secondNumber)));
    }

    /**
     * method calculates quotient of 2 numbers
     * @param firstNumber First Number
     * @param secondNumber Second Number
     * @return quotient of 2 numbers
     */
    public static double divider (double firstNumber, double secondNumber){
        return firstNumber/secondNumber;
    }
}
