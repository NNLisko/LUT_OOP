package main;

import java.util.ArrayList;

public class Bookshelf {
    ArrayList<Book> books = new ArrayList<Book>();

    public Bookshelf() {

    }

    public void addBook(Book book) {

    }

    public boolean removeBook(Book book) {
        return true;
    }

    public void displayBooks() {

    }

    public class Book {
        String title;
        String isbn;
        Author author;

        public Book(String title, String isbn, Author author) {

        }

        public String getTitle() {
            return "fool";
        }

        public String getIsbn() {
            return "fool";
        }

        public Author getAuthor() {
        }

        public class Author {
            String name;
            String nationality;

            public Author(String name, String nationality) {

            }
            
            public String getName() {
                return "fool";
            }

            public String getNationality() {
                return "fool";
            }
        }
    }
}

