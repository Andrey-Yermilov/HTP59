package Homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите цену в диапазоне 1-999 руб.");
        int price = Integer.parseInt(br.readLine());
        int remainder = price%10;
        switch (remainder){
            case 1:
                if (price%100==11){
                    System.out.println(String.format("%d рублей", price));
                }
                else {
                    System.out.println(String.format("%d рубль", price));
                }

                break;
            case 2:
            case 3:
            case 4:
                if (price%100==12 || price%100==13 || price%100==14){
                    System.out.println(String.format("%d рублей", price));
                }
                else {
                    System.out.println(String.format("%d рубля", price));}
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
