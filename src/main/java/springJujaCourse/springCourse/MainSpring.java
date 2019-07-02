package springJujaCourse.springCourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "springCourse/applicationContext.xml"
        );

        Music music = context.getBean("musicBean", Music.class);
        MusicPlayer player = new MusicPlayer(music);
        player.playMusic();
        context.close();
    }
}
