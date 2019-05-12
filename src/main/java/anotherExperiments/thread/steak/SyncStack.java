package anotherExperiments.thread.steak;

import java.util.ArrayList;
import java.util.List;

public class SyncStack {
    private List buffer = new ArrayList(400);

    public synchronized char pop() {
        char c;
        while (buffer.size() == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {

            }
        }
        c = ((Character) buffer.remove(buffer.size() - 1)).charValue();
        return c;
    }

    public synchronized void push(char c) {
        this.notify();
        Character character = new Character(c);
        buffer.add(character);
    }
}
