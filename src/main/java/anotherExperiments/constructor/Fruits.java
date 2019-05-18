package anotherExperiments.constructor;

import java.util.ArrayList;
import java.util.List;

public class Fruits {
    private List<String> fruitsList;

    public Fruits(List<String> fl) {
        this.fruitsList = fl;
    }

    public List<String> getFruitsList() {
        return fruitsList;
    }

    public void setFruitsList(List<String> fruitsList) {
        this.fruitsList = fruitsList;
    }

    public Fruits(Fruits fr) {
        List<String> fl = new ArrayList<>();
        for (String s : fr.getFruitsList()) {
            fl.add(s);
        }
        this.fruitsList = fl;
    }
}
