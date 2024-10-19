package com.library.dsa;

public class BookTree {
    private class TreeNode {
        Book book;
        TreeNode left, right;

        public TreeNode(Book book) {
            this.book = book;
            left = right = null;
        }
    }

    private TreeNode root;

    public void addBook(Book book) {
        root = insert(root, book);
    }

    private TreeNode insert(TreeNode root, Book book) {
        if (root == null) {
            root = new TreeNode(book);
            return root;
        }

        if (book.getId() < root.book.getId()) {
            root.left = insert(root.left, book);
        } else if (book.getId() > root.book.getId()) {
            root.right = insert(root.right, book);
        }

        return root;
    }

    public Book searchBook(int id) {
        return search(root, id);
    }

    private Book search(TreeNode root, int id) {
        if (root == null || root.book.getId() == id) {
            return root != null ? root.book : null;
        }

        if (id < root.book.getId()) {
            return search(root.left, id);
        } else {
            return search(root.right, id);
        }
    }
}
