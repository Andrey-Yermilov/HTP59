package OOP;

public class VocalComposition extends Composition implements Singable{

    public VocalComposition(String artistName, String trackTitle, int durationInSeconds, Style style) {
        super(artistName, trackTitle, durationInSeconds, style);
    }

    public void sing() {
        play();
        System.out.println("Play vocal");
    }
}
