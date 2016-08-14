package Homework13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean isStarted = false;
        while (!isStarted) {
            try {
                if (br.readLine().equalsIgnoreCase("start")) {
                    isStarted = true;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        NumbersPrinter firstThread = new NumbersPrinter();
        NumbersPrinter secondThread = new NumbersPrinter();
        firstThread.start();
        secondThread.start();
    }
}
