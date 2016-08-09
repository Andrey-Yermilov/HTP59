package Classwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.ResourceBundle;

public class Hello {
    public static void main(String[] args) {
        System.out.println("1 - EN, 2 - RU, 3- BE");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ResourceBundle rb ;
        int loc=0;
        Locale locale;
        try {
             loc = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.out.println("Incorrect value !");
        }
        switch (loc){
            case 1:
                locale = new Locale("en","US");
                 rb =  ResourceBundle.getBundle("translates/m", locale);
                break;
            case 2:
                locale = new Locale("ru","RU");
                 rb =  ResourceBundle.getBundle("translates/m", locale);
                break;
            case 3:
                locale = new Locale("be","BY");
                rb =  ResourceBundle.getBundle("translates/m", locale);
                break;
            default:
                locale = new Locale("en","US");
                rb =  ResourceBundle.getBundle("translates/m", locale);
                break;
        }
        System.out.println(rb.getString("hello"));
    }
}
