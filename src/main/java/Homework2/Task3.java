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
        double[] numbers = new double[2];
        numbers[0] = firstNumber;
        numbers[1] = secondNumber;
        System.out.println(String.format("Quotient is %f",divider(numbers)));
    }

    /**
     * method calculates quotient of 2 numbers
     * @param numbers array of 2 numbers
     * @return quotient of 2 numbers
     */
    public static double divider (double[] numbers){
        return numbers[0]/numbers[1];
    }
}
