package com.library.dsa;

import java.util.Stack;

public class BookStack {
    private Stack<Book> bookStack = new Stack<>();

    public void addReturnedBook(Book book) {
        bookStack.push(book);
        System.out.println("Book added to returned stack: " + book.getTitle());
    }

    public void viewLastReturnedBook() {
        if (!bookStack.isEmpty()) {
            System.out.println("Last returned book: " + bookStack.peek().getTitle());
        } else {
            System.out.println("No books in the returned stack.");
        }
    }
}
