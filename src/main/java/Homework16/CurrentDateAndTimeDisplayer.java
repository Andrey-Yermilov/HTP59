package Homework16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * display current date and time
 */
public class CurrentDateAndTimeDisplayer {
    public static void main(String[] args) {
        System.out.println("Choose date format. \n1 - EN, 2 - RU");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loc = 0;
        Locale locale;
        DateFormat df = null;
        Date currentDate = new Date();
        try {
            loc = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.out.println("Incorrect value!");
        }
        switch (loc) {
            case 1:
                locale = new Locale("en", "US");
                df = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, locale);
                break;
            case 2:
                locale = new Locale("ru", "RU");
                df = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, locale);
                break;
        }
        System.out.println(df.format(currentDate));
    }
}
