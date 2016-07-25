package OOP;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * utility class which allows to record list of compositions to disk, calculate total duration of
 * compositions, find compositions by duration and rearrange compositions by style
 */
public class MusicUtils {
    /**
     * creates text file in C: with list of compositions
     *
     * @param tracks list of compositions
     * @throws IOException
     */
    public static void recordToDisk(ArrayList<Composition> tracks) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter file name");
        String path = "C:\\" + br.readLine() + ".txt";
        File file = new File(path);
        file.createNewFile();
        BufferedWriter out = new BufferedWriter(new FileWriter(file, true));
        int number = 1;
        for (Composition track : tracks) {
            out.write(number + "-");
            out.write(track.toString());
            out.newLine();
            number++;
        }
        out.flush();
        System.out.println("File created");
    }

    /**
     * calculates total duration of compositions in seconds
     *
     * @param tracks list of compositions
     * @return total duration
     */
    public static int calculateDuration(ArrayList<Composition> tracks) {
        int totalDuration = 0;
        for (Composition track : tracks) {
            totalDuration = totalDuration + track.getDurationInSeconds();
        }
        return totalDuration;
    }

    /**
     * arrange compositions using compareTo() method from Composition class
     *
     * @param tracks initial list of compositions
     * @return arranged list of compositions
     */
    public static ArrayList<Composition> arrangeByStyle(ArrayList<Composition> tracks) {
        ArrayList<Composition> arrangedTracks = (ArrayList<Composition>) tracks.clone();
        Collections.sort(arrangedTracks);
        return arrangedTracks;
    }

    /**
     * finds compositions with specified duration and prints them
     *
     * @param tracks               list of compositions
     * @param minDurationInSeconds minimal duration
     * @param maxDurationInSecond  maximal duration
     */
    public static void findByDuration(ArrayList<Composition> tracks, int minDurationInSeconds, int maxDurationInSecond) {
        ArrayList<Composition> selectedCompositions = new ArrayList<Composition>();
        for (Composition track : tracks) {
            if (track.getDurationInSeconds() >= minDurationInSeconds && track.getDurationInSeconds() <= maxDurationInSecond) {
                selectedCompositions.add(track);
            }
        }
        for (Composition track : selectedCompositions) {
            System.out.println(track);
        }
        if (selectedCompositions.size() == 0) {
            System.out.println("No compositions with specified duration");
        }
    }

    /**
     * formats duration of composition in mm:ss format
     *
     * @param durationInSeconds duration in seconds
     * @return string with formatted time
     */
    public static String durationFormatter(int durationInSeconds) {
        int minutes = durationInSeconds / 60;
        int seconds = durationInSeconds - minutes * 60;
        return String.format("%02d:%02d", minutes, seconds);
    }
}
