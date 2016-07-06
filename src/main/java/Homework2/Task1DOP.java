package Homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1DOP {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter date");
        int date = Integer.parseInt(br.readLine());
        System.out.println("Enter month");
        int month = Integer.parseInt(br.readLine());
        System.out.println("Enter year");
        int year = Integer.parseInt(br.readLine());
        int monthRome;
        int numberOfYear;
        if (month > 2) {
            monthRome = month - 2;
            numberOfYear = year % 100;
        } else {
            monthRome = month + 10;
            numberOfYear = (year % 100)-1;
        }
        int dayOfWeek = (int) ((date + Math.floor(0.2 * (13 * monthRome - 1)) + numberOfYear + Math.floor((numberOfYear) / 4) + Math.floor((Math.floor(year / 100)) / 4) - 2 * Math.floor(year / 100) + 777) % 7);

        switch (dayOfWeek) {
            case 1:
                System.out.println("This day is Monday");
                break;
            case 2:
                System.out.println("This day is Tuesday");
                break;
            case 3:
                System.out.println("This day is Wednesday");
                break;
            case 4:
                System.out.println("This day is Thursday");
                break;
            case 5:
                System.out.println("This day is Friday");
                break;
            case 6:
                System.out.println("This day is Saturday");
                break;
            case 0:
                System.out.println("This day is Sunday");
                break;
        }
    }
}
