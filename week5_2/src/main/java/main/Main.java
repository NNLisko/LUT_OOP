package main;

public class Main
{
    public static void main( String[] args )
    {
        Bookshelf bookshelf = new Bookshelf();
        Book book = new Book("1984", "978-0451524935", new Author("George Orwell", "England"));
        Book book2 = new Book("Animal Farm", "978-0451526342", new Author("George Orwell", "England"));
        System.out.println("Initial bookshelf contents:");

        bookshelf.addBook(book);
        bookshelf.addBook(book2);

        bookshelf.displayBooks();

        bookshelf.removeBook(book);
        
    }
}
