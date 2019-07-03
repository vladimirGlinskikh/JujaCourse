package springJujaCourse.springCourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "springCourse/applicationContext.xml"
        );

        Music music = context.getBean("classicalMusic", Music.class);
        Music rockMusic = context.getBean("rockMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer rockMusicPlayer = new MusicPlayer(rockMusic);

        musicPlayer.playMusic();
        rockMusicPlayer.playMusic();
        context.close();
    }
}
