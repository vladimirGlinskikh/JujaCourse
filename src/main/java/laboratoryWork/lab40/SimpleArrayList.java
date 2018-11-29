package laboratoryWork.lab40;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SimpleArrayList<E> implements SimpleList<E> {
        private static final int DEFAULT_INITIAL_CAPACITY = 16;
    private E[] data;
    private int size = 0;
    private Iterator<E> iterator;

    public SimpleArrayList() {
        this(DEFAULT_INITIAL_CAPACITY);
    }

    public SimpleArrayList(int initialCapacity) {
        this.data = (E[]) new Object[initialCapacity];
        iterator = new Iterator<>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                if (!(index == size))
                    return true;
                else return false;
            }

            @Override
            public E next() {
                if (index == size) {
                    throw new NoSuchElementException();
                }
                index += 1;
                return data[index - 1];
            }

            @Override
            public void remove() {
                if (index <= 0) {
                    throw new IllegalArgumentException();
                }
                for (int i = index; i < size; i++) {
                    data[i - 1] = data[i];
                }
                size -= 1;
                data[size] = null;
            }
        };
    }

    @Override
    public boolean add(E newElement) {
        ensureCapacity(size + 1);
        data[size] = newElement;
        size++;
        return true;
    }

    @Override
    public E get(int index) {
        rangeCheck(index);
        return data[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E remove(int index) {
        rangeCheck(index);
        E oldValue = data[index];
        int numMoved = size - index - 1;
        System.arraycopy(data, index + 1, data, index, numMoved);
        data[--size] = null;
        return oldValue;
    }

    @Override
    public Iterator<E> iterator() {
        return iterator;
    }

    private void rangeCheck(int index) {
        if (index < 0 || size < index) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > data.length) {
            int newCapacity = Math.max(minCapacity, data.length + (data.length >> 1));
            E[] newData = (E[]) new Object[newCapacity];
            System.arraycopy(data, 0, newData, 0, data.length);
            this.data = newData;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof SimpleArrayList) {
            SimpleArrayList<E> obj = (SimpleArrayList<E>) o;
            if (size != obj.size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (!data[i].equals(obj.data[i])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(data);
    }

    @Override
    public String toString() {
        String brace = "[";
        int lastIndex = size - 1;

        if (size == 0) {
            return "[" + "]";
        }
        for (int i = 0; i < lastIndex; i++) {
            brace += data[i].toString() + ", ";
        }
        brace += data[lastIndex] + "]";
        return brace;
    }
}
