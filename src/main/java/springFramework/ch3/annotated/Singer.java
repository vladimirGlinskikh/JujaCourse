package springFramework.ch3.annotated;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("singer")
@Scope("prototype")
public class Singer {
    private String lyric = "I played a quick game of chess " +
            "with the salt and pepper shaker";

//    @Autowired
//    private Inspiration inspirationBean;

    public void sing() {
//        System.out.println("... " + inspirationBean.getLyric());
    }
}
