package definition;

import adt.LinkedListADT;

public class MyLinkedList<E> implements LinkedListADT<E> {
    private static class Node<E> {
        private Node<E> head = null;
        private int size = 0;
        private E data;
        private Node<E> next;

        private E getData() {
            return data;
        }

        private Node<E> getNext() {
            return next;
        }

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        private Node(E data) {
            this.data = data;
        }

        private void addFirst(E item) {
            Node<E> newNode = new Node<>(item);
            head = new Node<>(item, head);
            size++;
        }
    }


    @Override
    public void add(int index, E item) {
    }
}



