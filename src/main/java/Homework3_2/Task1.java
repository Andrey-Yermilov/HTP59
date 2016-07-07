package Homework3_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * method replaces symbol in k=3 position for each word with entered symbol
 */
public class Task1 {
    public static void main(String[] args) throws IOException{
        String initialString="Returns a new string resulting from replacing all occurrences of oldChar in this string with newChar";
        int k=3;
        String finalString="";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter symbol");
        String symbol =  br.readLine();
        String[] words = initialString.split("[\\s]");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length()>=k){
                words[i]=words[i].substring(0,k-1)+symbol+words[i].substring(k, words[i].length());
            }
        }
        for (String s:words) {
            finalString+=" "+s;
            finalString=finalString.trim();
        }
        System.out.println("String1: "+initialString);
        System.out.println("String2: "+finalString);

    }
}
