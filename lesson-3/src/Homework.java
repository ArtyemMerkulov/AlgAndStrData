import queue.DequeImpl;
import queue.IDeque;
import stack.IStack;
import stack.StackImpl;

public class Homework {
    public static void main(String[] args) {
        String inputStr = "Task1 was done!";
        task1(inputStr);
        task2();
    }

    public static void task2() {
        IDeque<Integer> deque = new DequeImpl<>(6);

        System.out.println("\nADD ELEMENTS\n");

        System.out.println(deque.toString());
        deque.addFirst(1);
        System.out.println(deque.toString());
        deque.addFirst(2);
        System.out.println(deque.toString());
        deque.addLast(3);
        System.out.println(deque.toString());
        deque.addFirst(4);
        System.out.println(deque.toString());
        deque.addLast(5);
        System.out.println(deque.toString());
        deque.addLast(6);
        System.out.println(deque.toString());
        System.out.println(deque.addLast(7));
        System.out.println(deque.toString());

        System.out.println("\nPEEK AND REMOVE ELEMENTS\n");

        System.out.println("FIRST: " + deque.peekFirst() +
                ", LAST: " + deque.peekLast() +
                ", ALL " + deque.toString());
        deque.removeLast();
        System.out.println("FIRST: " + deque.peekFirst() +
                ", LAST: " + deque.peekLast() +
                ", ALL " + deque.toString());
        deque.removeFirst();
        System.out.println("FIRST: " + deque.peekFirst() +
                ", LAST: " + deque.peekLast() +
                ", ALL " + deque.toString());
        deque.removeFirst();
        System.out.println("FIRST: " + deque.peekFirst() +
                ", LAST: " + deque.peekLast() +
                ", ALL " + deque.toString());
        deque.removeLast();
        System.out.println("FIRST: " + deque.peekFirst() +
                ", LAST: " + deque.peekLast() +
                ", ALL " + deque.toString());
        deque.removeLast();
        System.out.println("FIRST: " + deque.peekFirst() +
                ", LAST: " + deque.peekLast() +
                ", ALL " + deque.toString());
        deque.removeLast();
        System.out.println("FIRST: " + deque.peekFirst() +
                ", LAST: " + deque.peekLast() +
                ", ALL " + deque.toString());
        System.out.println(deque.removeFirst());
        System.out.println("FIRST: " + deque.peekFirst() +
                ", LAST: " + deque.peekLast() +
                ", ALL " + deque.toString());
    }

    public static void task1(String string) {
        IStack<Character> stringReverser = new StackImpl<>(string.length());

        System.out.println("Input string: " + string);
        for (Character character: string.toCharArray()) {
            stringReverser.push(character);
        }

        System.out.print("Output string: ");
        for (int i = stringReverser.size(); i > 0; i--) {
            System.out.print(stringReverser.pop());
        }

        System.out.println();
    }
}
