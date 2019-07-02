package springJujaCourse.springCourse;

public class MusicPlayer {
    private Music music;

    public MusicPlayer() {
    }

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Plaing: " + music.getSong());
    }

    public void setMusic(Music music) {
        this.music = music;
    }
}
