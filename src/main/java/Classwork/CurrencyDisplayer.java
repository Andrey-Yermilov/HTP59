package Classwork;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class CurrencyDisplayer {

    public static void main(String[] args) throws ParseException {
        String s = "10,5";
        Locale locale =  new Locale("uk","UA");
        NumberFormat numberFormat = NumberFormat.getNumberInstance(locale) ;
        Number num = numberFormat.parse(s);
        double n = num.doubleValue();
        NumberFormat curFormat = NumberFormat.getCurrencyInstance(locale) ;
        System.out.println(curFormat.format(n));
    }
}
