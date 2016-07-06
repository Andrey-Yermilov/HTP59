package Homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5DOP {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number");
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 1; i <=n ; i++) {
            sum=sum+i;
        }
        System.out.println("Sum = "+sum);

    }
}


