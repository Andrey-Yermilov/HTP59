package Homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7DOP {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first number");
        double first = Double.parseDouble(br.readLine());
        System.out.println("Enter second number");
        double second = Double.parseDouble(br.readLine());
        System.out.println("Choose arithmetic operation"+"\n"+"/ for division"+"\n"+"+ for division");
    }
}
