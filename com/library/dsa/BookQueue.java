package com.library.dsa;

import java.util.LinkedList;
import java.util.Queue;

public class BookQueue {
    private Queue<Book> bookQueue = new LinkedList<>();

    // Method to borrow a book (add to queue)
    public void borrowBook(Book book) {
        bookQueue.offer(book);
        System.out.println("Book borrowed: " + book.getTitle());
    }

    // Method to return a book (remove from queue and return the book)
    public Book returnBook() {
        Book returnedBook = bookQueue.poll(); // Retrieves and removes the head of the queue
        if (returnedBook != null) {
            System.out.println("Book returned: " + returnedBook.getTitle());
            return returnedBook; // Return the book that was removed
        } else {
            System.out.println("No books to return.");
            return null; // Return null if the queue is empty
        }
    }

    public void printQueue() {
        System.out.println("Books in queue: " + bookQueue);
    }
}
