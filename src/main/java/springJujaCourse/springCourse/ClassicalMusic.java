package springJujaCourse.springCourse;

import org.springframework.stereotype.Component;

public class ClassicalMusic implements Music {

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Something classic music...";
    }
}
