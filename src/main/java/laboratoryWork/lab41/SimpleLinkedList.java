package laboratoryWork.lab41;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class SimpleLinkedList<E> implements SimpleList<E> {
    private Node<E> first = null;
    private Node<E> last = null;
    private int size = 0;

    private static class Node<T> {
        private Node<T> prev;
        private T item;
        private Node<T> next;

        public Node(Node<T> prev, T item, Node<T> next) {
            this.prev = prev;
            this.item = item;
            this.next = next;
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || size < index) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    private Node<E> node(int index) {
        if (index < size / 2) {
            Node<E> tmp = first;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
            return tmp;
        } else {
            Node<E> x = last;
            for (int i = size - 1; i > index; i--) {
                x = x.prev;
            }
            return x;
        }
    }

    private E unlink(Node<E> x) {
        final E element = x.item;
        final Node<E> next = x.next;
        final Node<E> prev = x.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.item = null;
        size--;
        return element;
    }

    @Override
    public boolean add(E newElement) {
        final Node<E> tmp = last;
        final Node<E> newNode = new Node<>(tmp, newElement, null);
        last = newNode;
        if (tmp == null) {
            first = newNode;
        } else {
            tmp.next = newNode;
        }

        size++;
        return true;
    }


    @Override
    public E get(int index) {
        checkIndex(index);
        return node(index).item;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int cursor = 0;
            int last = -1;

            @Override
            public boolean hasNext() {
                return cursor != size();
            }

            @Override
            public E next() {
                try {
                    int i = cursor;
                    E next = get(i);
                    last = i;
                    cursor = i + 1;
                    return next;
                } catch (IndexOutOfBoundsException e) {
                    throw new NoSuchElementException();
                }
            }

            public void remove() {
                if (last < 0)
                    throw new IllegalStateException();
                try {
                    SimpleLinkedList.this.remove(last);
                    if (last < cursor)
                        cursor--;
                    last = -1;
                } catch (IndexOutOfBoundsException e) {
                    throw new ConcurrentModificationException();
                }
            }
        };
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E remove(int index) {
        checkIndex(index);
        return unlink(node(index));
    }

    //Here write our code.

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof SimpleList))
            return false;

        SimpleLinkedList<?> that = (SimpleLinkedList<?>) o;

        Iterator<E> iterThis = this.iterator();
        Iterator<?> iterThat = that.iterator();
        while (iterThis.hasNext() && iterThat.hasNext()) {
            E o1 = iterThis.next();
            Object o2 = iterThat.next();
            if (!(Objects.equals(o1, o2)))
                return false;
        }
        return !(iterThis.hasNext() || iterThat.hasNext());
    }

    @Override
    public String toString() {
        Iterator<E> it = iterator();
        if (!it.hasNext())
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (; ; ) {
            E e = it.next();
            sb.append(e == this ? "(this Collection)" : e);
            if (!it.hasNext())
                return sb.append(']').toString();
            sb.append(',').append(' ');
        }
    }

    @Override
    public int hashCode() {
        int hash = 1;
        Iterator<E> iterator = iterator();
        while (iterator.hasNext()) {
            E e = iterator.next();
            hash = 31 * hash + (e == null ? 0 : e.hashCode());
        }
        return hash;
    }
}
