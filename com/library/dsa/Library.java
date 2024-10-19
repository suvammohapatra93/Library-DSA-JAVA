package com.library.dsa;

public class Library {
    private BookList bookList; // Manages books using linked list
    private BookQueue bookQueue; // Manages book borrowing using queue
    private BookStack bookStack; // Manages recently returned books using stack
    private BookTree bookTree; // Manages searching for books using binary search tree

    public Library() {
        bookList = new BookList();
        bookQueue = new BookQueue();
        bookStack = new BookStack();
        bookTree = new BookTree();
    }

    // Method to add a book to the library
    public void addBook(int id, String title, String author) {
        Book book = new Book(id, title, author);
        bookList.addBook(book);
        bookTree.addBook(book);
        System.out.println("Book added: " + title);
    }

    // Method to print all books in the library
    public void printAllBooks() {
        System.out.println("All books in the library:");
        bookList.printBooks();
    }

    // Method to borrow a book (adds to queue)
    public void borrowBook(int id) {
        Book book = bookTree.searchBook(id);
        if (book != null) {
            bookQueue.borrowBook(book);
        } else {
            System.out.println("Book with ID " + id + " not found.");
        }
    }

    // Method to return a book (removes from queue and adds to stack)
    public void returnBook() {
        Book returnedBook = bookQueue.returnBook(); // Correctly returns a Book
        if (returnedBook != null) {
            bookStack.addReturnedBook(returnedBook);
        }
    }

    // Method to view the last returned book (using stack)
    public void viewLastReturnedBook() {
        bookStack.viewLastReturnedBook();
    }

    // Method to search for a book by its ID
    public void searchBook(int id) {
        Book book = bookTree.searchBook(id);
        if (book != null) {
            System.out.println("Book found: " + book);
        } else {
            System.out.println("Book with ID " + id + " not found.");
        }
    }
}
