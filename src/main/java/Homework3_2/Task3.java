package Homework3_2;

/**
 * remove all symbols except letters and whitespaces from text
 */
public class Task3 {
    public static void main(String[] args) {
        String initialText="<i> ||English text!@#$%^ 78Abcdef //Русский текст ~~`Ё.,ё";
        String modifiedText = initialText.replaceAll("[^(A-Za-zА-Яа-яЁё\\s)]","");
        System.out.println("Original text:  "+initialText);
        System.out.println("Corrected text: "+modifiedText);
    }
}
