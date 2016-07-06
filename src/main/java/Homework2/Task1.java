package Homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * initial string is being written by user in terminal
 */
public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your text");
        String initialString =  br.readLine();
        System.out.println(String.format("String length is %d symbols", initialString.length()));
        String[] splittedStrings = stringSplitter(initialString);
        stringWriter(splittedStrings);
    }

    /**
     * method splits initial string to 2 strings
     * @param initialString initial string
     * @return array of 2 strings
     */
    private static String[] stringSplitter (String initialString){
        String[] s=new String[2];
        int separator = initialString.length()/2;
        s[0] = initialString.substring(0,separator);
        s[1] = initialString.substring(separator);
        return  s;
    }

    /**
     * method writes array of strings
     * @param s array of strings
     */
    private static void stringWriter (String[] s){
        int i=1;
        for (String item:s ) {
            System.out.println(String.format("%d string: %s", i,item));
            i++;
        }
    }
}