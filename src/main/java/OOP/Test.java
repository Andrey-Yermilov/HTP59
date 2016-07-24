package OOP;

import java.util.*;
import java.io.*;

public class Test
{
    public static void main (String[] args)
    {
        char c = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println ( "Enter:\n" +
                "1 - to write list of compositions to disk\n" +
                "2 - to caclulate total duration of compositions\n" +
                "3 - to rearrange compositions by style and write new list of compositions to disk\n" +
                "4 - to find compositions by duration in seconds\n" +
                "q - to exit") ;
        do  {
            try {
                c= (char)  br.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(c) ;
        }
        while (c  !=  'q');}
    }
