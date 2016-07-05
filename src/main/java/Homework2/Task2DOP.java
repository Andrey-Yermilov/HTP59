package Homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2DOP {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter n");
        int n = Integer.parseInt(br.readLine());
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + (double)1/i;
        }
        System.out.println(sum);
    }
}

