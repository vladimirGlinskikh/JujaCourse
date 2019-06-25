package anotherExperiments.SOLID.LSP.violation;

public class MediaPlayer {
    public void playAudio() {
        System.out.println("Playing something audio...");
    }

    public void playVideo() throws VideoUnsupportedException {
        System.out.println("Playing something video...");
    }
}
