package Homework3;

public class Task1 {
    public static void main(String[] args) {
        float arr[] = new float[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) Math.random()*10;
            System.out.print(arr[i]+ " | ");
        }
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
sum = sum + arr[i];
        }
        System.out.println();
        System.out.println("Average value = "+(sum/arr.length));
    }
}
