package queue;

public interface IDeque<E> {

    boolean addFirst(E e);
    boolean addLast(E e);

    E removeFirst();
    E removeLast();

    E peekFirst();
    E peekLast();

    int size();

    boolean isEmpty();
    boolean isFull();
}
