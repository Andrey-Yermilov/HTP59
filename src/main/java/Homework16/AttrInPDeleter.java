package Homework16;

/**
 * remove attributes in all <p> tags
 */
public class AttrInPDeleter {
    public static void main(String[] args) {
        String initialString = "<html>\n" +
                " <head>\n" +
                "  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n" +
                "  <title>Применение абзацев</title>\n" +
                " </head>\n" +
                " <body>\n" +
                "   <p id='p1'>В одних садах цветёт миндаль, в других метёт метель.</p>\n" +
                "   <p id='p2'>В одних краях ещё февраль, в других - уже апрель.</p>\n" +
                "   <p id='p3' align=center>Проходит время, вечный счёт: год за год, век за век...</p>\n" +
                "   <p id='p4'>Во всём - его неспешный ход, его кромешный бег.</p>\n" +
                "   <p id='p5'>В году на радость и печаль по двадцать пять недель.</p>\n" +
                "   <p id='p6'align=left>Мне двадцать пять недель февраль, и двадцать пять - апрель.</p>\n" +
                "   <p id='p7'>По двадцать пять недель в туман уходит счёт векам.</p>\n" +
                "   <p>Летит мой звонкий балаган куда-то к облакам.</p>\n" +
                "   <p id='p9'align=right><i>М. Щербаков</i></p>\n" +
                " </body>\n" +
                "</html>";
        String correctedString;
        correctedString = initialString.replaceAll("<p[^>]+>", "<p>");
        System.out.println(correctedString);
    }
}
