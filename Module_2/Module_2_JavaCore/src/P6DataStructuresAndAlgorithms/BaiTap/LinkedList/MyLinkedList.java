package P6DataStructuresAndAlgorithms.BaiTap.LinkedList;

public class MyLinkedList<E> {
    private int size=0;
    private Node head;

    private class Node {
        Object element;
        Node next;

        Node(Object element) {
            this.element = element;
        }
    }
    public MyLinkedList(Object data) {
        this.head = new Node(data);
        size++;
    }
public void addFirst(E element){
    Node pointer = head;
    head = new Node(element);
    head.next = pointer;
    size++;
}
public void addLast(E element){
        Node pointer=head;
    while (pointer.next != null) {
        pointer = pointer.next;
    }
    pointer.next = new Node(element);
    size++;
}
public void add(int index, int element){
        Node pointer= head;
     for(int i=0;i<index-1;i++){
         pointer=pointer.next;
     }
     pointer = new Node(element);
     size++;
}
public void remove(int index){


}
    public MyLinkedList<E> clone() {
        MyLinkedList<E> myLinkedList = new MyLinkedList<E>(head.element);

        Node pointer = head.next;
        for (int i = 1; i < size; i++) {
            myLinkedList.addLast((E)pointer.element);
            pointer = pointer.next;
        }
        return myLinkedList;
    }

}
