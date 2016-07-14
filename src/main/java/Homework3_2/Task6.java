package Homework3_2;

/**
 *  define whether one string is rearranged another string
 */
public class Task6 {
    public static void main(String[] args) {
        String string1 = "bottle";
        String string2 = "ttelob";
        System.out.println("String 1: " + string1);
        System.out.println("String 2: " + string2);
        System.out.println("Comparison result: " + stringsComparator(string1, string2));
        String string3 = "bottle";
        String string4 = "qqqlob";
        System.out.println("String 3: " + string3);
        System.out.println("String 4: " + string4);
        System.out.println("Comparison result: " + stringsComparator(string3, string4));
    }

    /**
     * Method compares 2 strings
     * @param string1 first string
     * @param string2 second string
     * @return boolean result for  two string comparison
     */
    public static boolean stringsComparator(String string1, String string2) {
        char[] ch1 = string1.toCharArray();
        String sortedString1 = new String(sortString(ch1));
        char[] ch2 = string2.toCharArray();
        String sortedString2 = new String(sortString(ch2));
        return sortedString1.equals(sortedString2);
    }

    /**
     * Method uses bubble sorting to sort initial array of chars
     * @param arr array of chars
     * @return sorted array
     */
    public static char[] sortString(char[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (Character.getNumericValue(arr[j]) > Character.getNumericValue(arr[j+1])) {
                    char tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }
}
