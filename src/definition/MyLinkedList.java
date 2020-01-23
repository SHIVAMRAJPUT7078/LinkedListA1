package definition;

import adt.LinkedListADT;

public class MyLinkedList<E> implements LinkedListADT<E> {
    private static class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        private Node(E data) {
            this.data = data;
        }
    }

    @Override
    public void add(int index, E item) {

    }
}



