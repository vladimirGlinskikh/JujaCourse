package springFramework.ch3.annotated;

import org.springframework.stereotype.Component;

@Component
public class Singer {
    private String lyric = "We found a message in a bottle we were drinking.";

    public void sing() {
        System.out.println(lyric);
    }
}
