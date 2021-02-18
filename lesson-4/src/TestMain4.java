public class TestMain4 {

    public static void main(String[] args) {
//        testLinkedList();
        testForEach();
    }
    private static void testForEach() {
        LinkedList<Integer> linkedList = new SimpleLinkedListImpl<>();

        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.insertFirst(5);

        // Реализация через forEach
        linkedList.display();

        System.out.println("----");

        // Обычный forEach
        for(Integer value: linkedList) {
            System.out.println(value);
        }

        System.out.println("----");

        // forEach с Consumer
        linkedList.forEach(x -> {
            x++;
            System.out.println(x);
        });

//        List<Integer> arrayList = new ArrayList<>();
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(3);
//        arrayList.add(4);
//
//        for (Integer integer : arrayList) {
//            System.out.println(integer);
//        }
//
//        System.out.println("----");
//
//        Iterator<Integer> iterator = arrayList.iterator();
//        while (iterator.hasNext()) {
//            Integer value = iterator.next();
//            System.out.println(value);
//        }
    }

    private static void testLinkedList() {
//        LinkedList<Integer> linkedList = new SimpleLinkedListImpl<>();
        TwoSideLinkedList<Integer> linkedList = new TwoSideLinkedListImpl<>();
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.insertLast(5);

        linkedList.display();

        System.out.println("Find 2: " + linkedList.contains(2));
        System.out.println("Find 1: " + linkedList.contains(1));
        System.out.println("Find 4: " + linkedList.contains(4));
        System.out.println("Find 4444: " + linkedList.contains(4444));

        linkedList.removeFirst();
        linkedList.remove(2);

        linkedList.display();
    }


}
