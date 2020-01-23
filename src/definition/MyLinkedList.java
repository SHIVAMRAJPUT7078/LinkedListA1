package definition;

import adt.LinkedListADT;

public class MyLinkedList<E> implements LinkedListADT<E> {
    private static class Node<E> {
        private E data;
        private Node<E> next;

        private Node(E data) {
            this.data = data;
        }
    }

    @Override
    public void add(int index, E item) {

    }
}



