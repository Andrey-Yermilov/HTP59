package Homework3_2;

/**
 * replace every english letter with it number in the alphabet
 */
public class Task2 {
    public static void main(String[] args) {
        String initialString="Returns a new string resulting from replacing all occurrences of oldChar in this string with newChar";
        initialString = initialString.replaceAll("[\\s]","");
        String modifiedString = initialString.toUpperCase();
        for (int i = 0; i < initialString.length(); i++) {
            System.out.print(initialString.charAt(i)+"  ");
        }
        System.out.println();
        for (int i = 0; i < modifiedString.length(); i++) {
            Character c = modifiedString.charAt(i);
            System.out.printf("%02d ",(c.hashCode()-64));
        }
    }
}
