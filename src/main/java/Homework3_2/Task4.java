package Homework3_2;

public class Task4 {
    public static void main(String[] args) {
        String initialString="Returns a new string resulting from replacing all occurrences of oldChar in this string with newChar abcd erty qwer";
        int n = 4; // length of words which should be deleted
        String correctedString = initialString.toLowerCase();
        String[] words = correctedString.split("[\\s]");
        for (int i = 0; i < words.length; i++)
            if (words[i].length()==n){
                if (!(words[i].startsWith("a")||words[i].startsWith("e")||words[i].startsWith("i")||words[i].startsWith("o")||words[i].startsWith("u")||words[i].startsWith("y"))){
                    words[i]="";
                }
            }
        for (String word:words
             ) {
            System.out.print((word+" ").replaceAll("",""));
        }
    }
}
