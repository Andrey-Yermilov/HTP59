package Homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число в диапазоне 1-999 руб.");
        int price = Integer.parseInt(br.readLine());
        int remainder = price%10;
        switch (remainder){
            case 1:
                System.out.println(String.format("%d рубль", price));
                break;
            case 2:
            case 3:
            case 4:
                System.out.println(String.format("%d рубля", price));
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 0:
                System.out.println(String.format("%d рублей", price));
                break;
        }
    }
}
