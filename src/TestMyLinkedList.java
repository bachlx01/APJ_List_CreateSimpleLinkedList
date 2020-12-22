public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4,41);
        ll.add(4,42);
        ll.add(4,43);
        ll.add(4,44);
        ll.add(4,45);
        ll.add(3,2);
        ll.printList();
    }
}