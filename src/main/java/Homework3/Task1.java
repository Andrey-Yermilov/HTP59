package Homework3;

public class Task1 {
    public static void main(String[] args) {
        float arr[] = new float[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) Math.random();
            System.out.print(arr[i]+ " | ");
        }
    }
}
