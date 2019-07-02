package springJujaCourse.springCourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "springCourse/applicationContext.xml"
        );

        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer player1 = context.getBean("musicPlayer", MusicPlayer.class);

        boolean comparison = player == player1;
        System.out.println(comparison);
        System.out.println(player);
        System.out.println(player1);
        player.playMusicList();
        context.close();
    }
}
