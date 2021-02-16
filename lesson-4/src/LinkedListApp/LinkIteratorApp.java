package LinkedListApp;

public class LinkIteratorApp {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        LinkIterator itr = new LinkIterator(list);

        itr.insertAfter("Artem", 20);
        itr.insertBefore("Sergey", 10);

        list.display();

        System.out.println(itr.getCurrent().name); // Sergey 10
        itr.nextLink(); // Теперь итератор указывает на следующий элемент
        System.out.println(itr.getCurrent().name); // Artem 20
        System.out.println(itr.atEnd()); // Достигли конца? TRUE
        itr.reset(); // Сброс итератора к первоначальной позиции
        System.out.println(itr.getCurrent().name); // Sergey 10
        System.out.println(itr.atEnd()); // Достигли конца? FALSE
        itr.insertAfter("TEST1", 30); // Вставка после элемента, на который указывает итератор
        System.out.println(itr.getCurrent().name); // TEST1 30
        list.display();
        itr.nextLink(); // Теперь итератор указывает на следующий элемент
        System.out.println(itr.getCurrent().name); // Artem 20
        System.out.println(itr.atEnd()); // Достигли конца? TRUE
        itr.reset(); // Сброс итератора к первоначальной позиции
        itr.insertBefore("TEST2", 40); // Вставка перед элементом, на который указывает итератор.
        // Теперь TEST2 40 - первый элемент
        list.display();
        itr.deleteCurrent(); // Удаляем элемент, на который указывает итиратор, т.е. TEST2 40
        list.display();
    }
}

