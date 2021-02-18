import java.util.Iterator;
import java.util.NoSuchElementException;

public class ListIterator<E> implements Iterator<E> {

    private LinkedList.Node<E> node;

    public ListIterator(LinkedList.Node<E> node) {
        this.node = node;
    }

    @Override
    public boolean hasNext() {
        return node != null;
    }

    @Override
    public E next() {
        if (!hasNext()) throw new NoSuchElementException("No more elements!");

        E item = node.item;
        node = node.next;

        return item;
    }
}
