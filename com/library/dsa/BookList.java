package com.library.dsa;

public class BookList {
    private Node head;

    private static class Node {
        Book book;
        Node next;

        public Node(Book book) {
            this.book = book;
            this.next = null;
        }
    }

    public void addBook(Book book) {
        Node newNode = new Node(book);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void printBooks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.book);
            current = current.next;
        }
    }
}
