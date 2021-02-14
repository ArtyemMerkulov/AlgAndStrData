package queue;


public class DequeImpl<E> implements IDeque<E> {

    private final E[] data;
    private int size;

    private int tail;
    private int head;

    @SuppressWarnings("unchecked")
    public DequeImpl(int size) {
        this.data = (E[]) new Object[size];
        this.tail = -1;
        this.head = 0;
    }


    @Override
    public boolean addFirst(E e) {
        if (e == null) throw new NullPointerException();
        if (isFull()) return false;

        data[head = modDec(head, data.length)] = e;
        size++;

        return true;
    }

    @Override
    public boolean addLast(E e) {
        if (e == null) throw new NullPointerException();
        if (isFull()) return false;

        data[tail = modInc(tail, data.length)] = e;
        size++;

        return true;
    }

    @Override
    public E removeFirst() {
        if (isEmpty()) return null;

        E e = data[head];
        data[head] = null;
        head = modInc(head, data.length);
        size--;

        return e;
    }

    @Override
    public E removeLast() {
        if (isEmpty()) return null;

        E e = data[tail];
        data[tail] = null;
        tail = modDec(tail, data.length);
        size--;

        return e;
    }

    @Override
    public E peekFirst() {
        if (isEmpty()) return null;
        return data[head];
    }

    @Override
    public E peekLast() {
        if (isEmpty()) return null;
        return data[tail];
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
    public boolean isFull() {
        return size == data.length;
    }

    private int modInc(int value, int mod) {
        if (++value >= mod) value = 0;
        return value;
    }

    private int modDec(int value, int mod) {
        if (--value < 0) value = mod - 1;
        return value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i = head, count = size;

        while (count > 0) {
            E e = data[i];
            if (e != null) {
                sb.append(e);
                if (count > 1) sb.append(", ");
            }
            i = modInc(i, data.length);
            count--;
        }
        sb.append("]");

        return sb.toString();
    }
}
