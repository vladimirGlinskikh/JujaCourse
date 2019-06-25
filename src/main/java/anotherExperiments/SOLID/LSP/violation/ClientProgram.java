package anotherExperiments.SOLID.LSP.violation;

import java.util.ArrayList;
import java.util.List;

public class ClientProgram {
    public static void main(String[] args) throws VideoUnsupportedException {
        List<MediaPlayer> allPlayers = new ArrayList<>();

        allPlayers.add(new VLCMediaPlayer());
        allPlayers.add(new WinampMediaPlayer());

        playVideoInAllMediaPlayers(allPlayers);

        System.out.println("-------------------------------");
    }

    private static void playVideoInAllMediaPlayers(List<MediaPlayer> allPlayers) throws VideoUnsupportedException {
        for (var player : allPlayers) {
            player.playVideo();
        }
    }
}
