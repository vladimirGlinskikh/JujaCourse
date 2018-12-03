package laboratoryWork.lab42;

import java.util.Iterator;

class FinderElements {
    public static Integer finderElement(SinglyLinkedList<Integer> singlyLinkedList, int k) {
        Iterator<Integer> iterator = singlyLinkedList.iterator();
        int size = 0;
        while (iterator.hasNext()) {
            iterator.next();
            size++;
        }

        int index = size - 1 - k;
        if (index < 0)
            throw new IndexOutOfBoundsException();
        iterator = singlyLinkedList.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            int result = iterator.next();
            if (index == count)
                return result;
            count++;
        }
        throw new IndexOutOfBoundsException();
    }
}
