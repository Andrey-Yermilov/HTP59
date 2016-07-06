package Homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * user should enter 1st and 2nd numbers and choose operation and press enter.
 * If user wants to quit he should press "q" and "enter" after performing math operation;
 * if he wants to start again he should press any button except "q"
 */
public class Task7DOP {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("Enter first number");
            double first = Double.parseDouble(br.readLine());
            System.out.println("Enter second number");
            double second = Double.parseDouble(br.readLine());
            System.out.println("Choose arithmetic operation"+"\n"+"/ for division"+"\n"+"+ for addition");
            String operation = br.readLine();
            if (operation.contains("+"))   {
                double result = first+second;
                System.out.println(String.format("%f + %f = %f",first,second,result ));
            }
            else if (operation.contains("/")){
                double result = first/second;
                System.out.println(String.format("%f / %f = %f",first,second,result ));
            }
            if (br.readLine().contains("q")){
                break;
            }
            else {
                continue;
            }
        }
    }
}
