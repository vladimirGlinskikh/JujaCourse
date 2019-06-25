package anotherExperiments.SOLID.LSP.violation;

public class WinampMediaPlayer extends MediaPlayer {

    @Override
    public void playVideo() throws VideoUnsupportedException {
        throw new VideoUnsupportedException();
    }
}
