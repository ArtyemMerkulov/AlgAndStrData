import java.sql.Time;
import java.time.LocalTime;
import java.util.Collections;
import java.util.Random;

public class Main {

    private static final int INIT_CAPACITY = 100000;

    public static void main(String[] args) {
        Array<Integer> arr1 = buildRandomArr(INIT_CAPACITY);
        Array<Integer> arr2 = new ArrayImpl<>(arr1);
        Array<Integer> arr3 = new ArrayImpl<>(arr1);

        System.out.println("-------------- BUBBLE SORT " + arr1.size() + " size -----------------");

        long bubbleSortStartTime = System.nanoTime();
        System.out.println("Start bubbleSort: " + bubbleSortStartTime);

        arr1.sortBubble();

        long bubbleSortStopTime = System.nanoTime();
        System.out.println("Stop bubbleSort: " + bubbleSortStopTime);
        System.out.println("Duration: " + (bubbleSortStopTime - bubbleSortStartTime));

        System.out.println("-------------- SELECTION SORT " + arr2.size() + " size -----------------");

        bubbleSortStartTime = System.nanoTime();
        System.out.println("Start bubbleSort: " + bubbleSortStartTime);

        arr2.sortSelect();

        bubbleSortStopTime = System.nanoTime();
        System.out.println("Stop bubbleSort: " + bubbleSortStopTime);
        System.out.println("Duration: " + (bubbleSortStopTime - bubbleSortStartTime));

        System.out.println("-------------- INSERTION SORT " + arr3.size() + " size -----------------");

        bubbleSortStartTime = System.nanoTime();
        System.out.println("Start bubbleSort: " + bubbleSortStartTime);

        arr3.sortInsert();

        bubbleSortStopTime = System.nanoTime();
        System.out.println("Stop bubbleSort: " + bubbleSortStopTime);
        System.out.println("Duration: " + (bubbleSortStopTime - bubbleSortStartTime));
    }

    private static Array<Integer> buildRandomArr(int len) {
        Random randomEngine = new Random();

        Array<Integer> arr = new ArrayImpl<>(len);
        for (int i = 0; i < len; i++)
            arr.add(randomEngine.nextInt());

        return arr;
    }
}
