package quizs.quiz28.hashMap.question1;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 0);
        map.put("B", map.put("A", 0));
        map.put("C", map.put("B", 1));
        System.out.println(map.keySet().size());
        //3
    }
}
