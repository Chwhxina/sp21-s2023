package deque;

import java.util.Iterator;

public interface Deque<T> extends Iterable<T> {
    public void addFirst(T item);
    public void addLast(T item);
    default boolean isEmpty() {
        return size() == 0;
    }
    public int size();
    public void printDeque();
    public T removeFirst();
    public T removeLast();
    public T get(int index);
    Iterator<T> iterator();
}
