package Homework3_2;

/**
 * define whether all symbols in the strings are unique
 */
public class Task5 {
    public static void main(String[] args) {
        String initialString="11qwertyuiopljhhbvfd3";
        System.out.println("String: "+initialString);
        char[] initialChars = initialString.toLowerCase().toCharArray();
        char[] sortedChars = sortString(initialChars);
        boolean isUnique=true;
        for (int i = 0; i < sortedChars.length-1; i++) {
            if (sortedChars[i]==sortedChars[i+1]){
                System.out.println("'"+sortedChars[i]+"' symbol found more than one time");
                isUnique=false;
                            }
        }
        if (isUnique){
            System.out.println("All symbols found only one time");
        }

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
