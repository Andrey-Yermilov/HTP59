package OOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * main class with console menu; to perform action user should enter correct number or 'q' for exit
 *
 */
public class MusicMenu {
    public static void main(String[] args) {
        ArrayList<Composition> tracks = new ArrayList<Composition>();
        tracks.add(new VocalComposition("Deep Purple", "Perfect Strangers", 322, Style.Rock));
        tracks.add(new Composition("Acoustic Alchemy", "Mr. Chow", 189, Style.Instrumental));
        tracks.add(new VocalComposition("Dio", "Holy Diver", 355, Style.Rock));
        tracks.add(new Composition("Frank Duval", "Angel of Mine", 254, Style.Instrumental));
        tracks.add(new VocalComposition("Dark Tranquillity", "Damage Done", 206, Style.Metal));
        tracks.add(new Composition("Forest Stream", "Last Season Purity", 736, Style.Metal));
        tracks.add(new VocalComposition("Dionne Warwick", "That's What Friends Are For", 258, Style.Soul));
        tracks.add(new VocalComposition("Dark Tranquillity", "Archetype", 269, Style.Metal));
        tracks.add(new VocalComposition("Claire Martin", "People Make The World Go Round", 244, Style.Soul));
        tracks.add(new VocalComposition("Scorpions", "Wind Of Change", 334, Style.Rock));

        char c = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Choose language. \n1 - EN, 2 - RU");

        int loc = 0;
        Locale locale;
        DateFormat df;
        Date currentDate = new Date();
        ResourceBundle rb ;
        try {
            loc = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.out.println("Incorrect value!");
        }
        switch (loc) {
            case 1:
                locale = new Locale("en", "US");
                df = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, locale);
                rb =  ResourceBundle.getBundle("translates/music", locale);
                break;
            case 2:
                locale = new Locale("ru", "RU");
                df = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, locale);
                rb =  ResourceBundle.getBundle("translates/music", locale);
                break;
            default:
                locale = new Locale("en", "US");
                df = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, locale);
                rb =  ResourceBundle.getBundle("translates/music", locale);
        }
        System.out.println(df.format(currentDate));
        System.out.println(rb.getString("menu"));
        do {
            try {
                c = (char) br.read();
            } catch (IOException e) {
                e.printStackTrace();
            }

            switch (c) {
                case '1':
                    try {
                        MusicUtils.recordToDisk(tracks,rb);
                    } catch (IOException e) {
                        System.out.println(rb.getString("recordError"));
                    }
                    break;
                case '2':
                    System.out.println(rb.getString("totalDur")+" - " + MusicUtils.durationFormatter(MusicUtils.calculateDuration(tracks)));
                    break;
                case '3':
                    ArrayList<Composition> sortedTracks = MusicUtils.arrangeByStyle(tracks);
                    try {
                        MusicUtils.recordToDisk(sortedTracks,rb);
                    } catch (IOException e) {
                        System.out.println(rb.getString("recordError"));
                    }
                    break;
                case '4':
                    System.out.println(rb.getString("minDurMsg"));
                    BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
                    int minDuration = 0;
                    try {
                        minDuration = Integer.parseInt(br2.readLine());
                    } catch (IOException | NumberFormatException e) {
                        System.out.println(rb.getString("notANumberError"));
                        continue;
                    }
                    System.out.println(rb.getString("maxDurMsg"));
                    int maxDuration = 0;
                    try {
                        maxDuration = Integer.parseInt(br2.readLine());
                    } catch (IOException | NumberFormatException e) {
                        System.out.println(rb.getString("notANumberError"));
                        continue;
                    }
                    MusicUtils.findByDuration(tracks, minDuration, maxDuration, rb);
                    break;
            }
        }
        while (c != 'q');
    }
}
