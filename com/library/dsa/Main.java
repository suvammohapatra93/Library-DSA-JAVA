package com.library.dsa;

public class Main {
    public static void main(String[] args) {
        // Create some books
        Book book1 = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book(2, "1984", "George Orwell");
        Book book3 = new Book(3, "To Kill a Mockingbird", "Harper Lee");

        // Linked List for book management
        BookList bookList = new BookList();
        bookList.addBook(book1);
        bookList.addBook(book2);
        bookList.addBook(book3);
        System.out.println("Library Books:");
        bookList.printBooks();

        // Queue for borrowing books
        BookQueue bookQueue = new BookQueue();
        bookQueue.borrowBook(book1);
        bookQueue.borrowBook(book2);
        System.out.println("\nQueue after borrowing:");
        bookQueue.printQueue();
        bookQueue.returnBook();

        // Stack for returned books
        BookStack bookStack = new BookStack();
        bookStack.addReturnedBook(book1);
        bookStack.viewLastReturnedBook();

        // Binary Search Tree for searching books by ID
        BookTree bookTree = new BookTree();
        bookTree.addBook(book1);
        bookTree.addBook(book2);
        bookTree.addBook(book3);
        System.out.println("\nSearching for book with ID 2:");
        System.out.println(bookTree.searchBook(2));
    }
}
