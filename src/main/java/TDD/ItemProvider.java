package TDD;

import java.util.List;

public interface ItemProvider {
    List<Item> fetchItems(Item ancestor, int itemCount);

    int getNewCount(Item predecessor);

    List<Item> fetchNew(Item predecessor);
}
