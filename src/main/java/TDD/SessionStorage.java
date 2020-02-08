package TDD;

public interface SessionStorage {
    void storeTop(Item top);

    Item readTop();
}
