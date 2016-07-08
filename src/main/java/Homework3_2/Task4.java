package Homework3_2;

public class Task4 {
    public static void main(String[] args) {
        String initialStringEnglish="cat dog all evil camp a the at evidence map camera";
        String correctedStringEnglish="";
        String initialStringRussian="мама мыла раму мир ялта солнце пёс кот снег по река ель";
        String correctedStringRussian="";
        int n = 3; // length of words which should be deleted
        String[] wordsEnglish = initialStringEnglish.toLowerCase().split("[\\s]");
        String[] wordsRussian = initialStringRussian.toLowerCase().split("[\\s]");
        for (int i = 0; i < wordsEnglish.length; i++)
            if (wordsEnglish[i].length()==n){
                if (!(wordsEnglish[i].startsWith("a")||wordsEnglish[i].startsWith("e")||wordsEnglish[i].startsWith("i")||wordsEnglish[i].startsWith("o")||wordsEnglish[i].startsWith("u")||wordsEnglish[i].startsWith("y"))){
                    wordsEnglish[i]="";
                }
            }
        for (String word:wordsEnglish
                ) {
            correctedStringEnglish = correctedStringEnglish+word+" ";
        }
        correctedStringEnglish=correctedStringEnglish.replaceAll("[\\s+]"," ").trim();
        System.out.println("Initial string:   "+initialStringEnglish);
        System.out.println("Corrected string: "+correctedStringEnglish);

        for (int i = 0; i < wordsRussian.length; i++)
            if (wordsRussian[i].length()==n){
                if (!(wordsRussian[i].startsWith("а")||wordsRussian[i].startsWith("е")||wordsRussian[i].startsWith("ё")||wordsRussian[i].startsWith("и")||wordsRussian[i].startsWith("о")||wordsRussian[i].startsWith("у")||wordsRussian[i].startsWith("ы")||wordsRussian[i].startsWith("э")||wordsRussian[i].startsWith("ю")||wordsRussian[i].startsWith("я"))){
                    wordsRussian[i]="";
                }
            }
        for (String word:wordsRussian
                ) {
            correctedStringRussian = correctedStringRussian+word+" ";
        }
        correctedStringRussian=correctedStringRussian.replaceAll("\\s+"," ").trim();
        System.out.println("Исходная строка:          "+initialStringRussian);
        System.out.println("Скорректированная строка: "+correctedStringRussian);
    }
}
