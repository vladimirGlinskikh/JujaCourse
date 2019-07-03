package springJujaCourse.springCourse;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Something rock music...";
    }
}
