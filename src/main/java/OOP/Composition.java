package OOP;

import java.io.Serializable;

/**
 * data class for musical composition,
 */
public class Composition implements Playable, Serializable, Comparable {
    private String artistName;
    private String trackTitle;
    private int durationInSeconds;
    private Style style;

    public void play() {
        System.out.println("Composition is being played");
    }

    public Composition(String artistName, String trackTitle, int durationInSeconds, Style style) {
        this.artistName = artistName;
        this.trackTitle = trackTitle;
        this.durationInSeconds = durationInSeconds;
        this.style = style;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getTrackTitle() {
        return trackTitle;
    }

    public void setTrackTitle(String trackTitle) {
        this.trackTitle = trackTitle;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    public void setDurationInSeconds(int durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Composition that = (Composition) o;

        if (durationInSeconds != that.durationInSeconds) return false;
        if (!artistName.equals(that.artistName)) return false;
        if (!trackTitle.equals(that.trackTitle)) return false;
        return style == that.style;

    }

    @Override
    public int hashCode() {
        int result = artistName.hashCode();
        result = 31 * result + trackTitle.hashCode();
        result = 31 * result + durationInSeconds;
        result = 31 * result + style.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return String.format("\'%s - %s\'...%s, style:%s", artistName, trackTitle, MusicUtils.durationFormatter(durationInSeconds), style);
    }

    /**
     * method is used to arrange compositions by style, then by artist name, then by track title
     *
     * @param o composition to compare
     * @return 0, positive or negative value
     */
    @Override
    public int compareTo(Object o) {
        Composition entry = (Composition) o;
        int result = style.toString().compareTo(entry.style.toString());
        if (result != 0) {
            return result;
        }
        result = artistName.compareTo(entry.artistName);
        if (result != 0) {
            return result;
        }
        result = trackTitle.compareTo(entry.trackTitle);
        if (result != 0) {
            return result;
        }
        return 0;
    }
}
