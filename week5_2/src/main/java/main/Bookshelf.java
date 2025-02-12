package main;

import java.util.ArrayList;

class Bookshelf {
    private ArrayList<Book> books = new ArrayList<Book>();

    Bookshelf() {
    }

    void addBook(Book book) {
        books.add(book);
    }

    boolean removeBook(Book book) {
        if (books.contains(book)) {
            books.remove(book);
            System.out.println();
            System.out.println("Removing " + book.getTitle() + "...");
            System.out.println();
            System.out.println("Updated bookshelf contents:");
            displayBooks();
            return true;
        }
        System.out.println("Book not found.");
        return false;
    }

    void displayBooks() {
        System.out.println("Books on the shelf:");
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor().getName() + ", ISBN: " + book.getIsbn());
        }
    }

}

