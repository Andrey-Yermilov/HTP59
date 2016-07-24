package OOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MusicMenu {
    public static void main(String[] args)  {
        ArrayList<Composition> tracks = new ArrayList<Composition>();
        tracks.add(new VocalComposition("Deep Purple","Perfect Strangers", 322,Style.Rock));
        tracks.add(new Composition("Acoustic Alchemy","Mr. Chow",189,Style.Instrumental));
        tracks.add(new VocalComposition("Dio","Holy Diver", 355,Style.Rock));
        tracks.add(new Composition("Frank Duval","Angel of Mine",254,Style.Instrumental));
        tracks.add(new VocalComposition("Dark Tranquillity","Damage Done",206,Style.Metal));
        tracks.add(new Composition("Forest Stream","Last Season Purity",736,Style.Metal));
        tracks.add(new VocalComposition("Dionne Warwick","That's What Friends Are For",258,Style.Soul));
        tracks.add(new VocalComposition("Dark Tranquillity","Archetype",269,Style.Metal));
        tracks.add(new VocalComposition("Claire Martin","People Make The World Go Round",244,Style.Soul));
        tracks.add(new VocalComposition("Scorpions","Wind Of Change",334,Style.Rock));

        char c=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println ( "Enter:\n" +
                "1 - to write list of compositions to disk\n" +
                "2 - to calculate total duration of compositions\n" +
                "3 - to rearrange compositions by style and write new list of compositions to disk\n" +
                "4 - to find compositions by duration in seconds\n" +
                "q - to exit") ;
        do  {
            try {
                c = (char)  br.read();
            } catch (IOException e) {
                e.printStackTrace();
            }

            switch (c){
                case '1':
                    try {
                        MusicUtils.recordToDisk(tracks);
                    } catch (IOException e) {
                        System.out.println("Impossible to record file");
                    }
                    break;
                case '2':
                    System.out.println("Total duration - "+MusicUtils.durationFormatter(MusicUtils.calculateDuration(tracks)));
                    break;
                case '3':
                    ArrayList<Composition> sortedTracks = MusicUtils.arrangeByStyle(tracks);
                    try {
                        MusicUtils.recordToDisk(sortedTracks);
                    } catch (IOException e) {
                        System.out.println("Impossible to record file");
                    }
                    break;
                case '4':
                    System.out.println("Enter minimal duration in seconds");
                    BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
                    int  minDuration = 0;
                    try {
                        minDuration = Integer.parseInt(br2.readLine());
                    } catch (IOException | NumberFormatException e) {
                        System.out.println("Entered string is not a number");
                        continue;
                    }
                    System.out.println("Enter maximal duration in seconds");
                    int  maxDuration = 0;
                    try {
                        maxDuration = Integer.parseInt(br2.readLine());
                    } catch (IOException | NumberFormatException e) {
                        System.out.println("Entered string is not a number");

                        continue;
                    }
                    MusicUtils.findByDuration(tracks,minDuration,maxDuration);
                    break;
            }

        }
        while (c  !=  'q');
    }
}
