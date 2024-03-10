package com.guvi.task3;

public class MainDriver {

	public static void main(String[] args) {
        Library library = new Library();

        // Add some books
        library.addBook(new Book(101, "The Lord of the Rings", "J.R.R. Tolkien", true));
        library.addBook(new Book(102, "The Hitchhiker's Guide to the Galaxy", "Douglas Adams", true));
        library.addBook(new Book(103, "The Harry Potter Series", "J.K. Rowling", false));

        // Display all books
        System.out.println("All Books:");
        library.displayBooks();

        // Search for a book
        System.out.println("\nSearch for book with ID 102:");
        Book book = library.searchBook(102);
        if (book != null) {
            System.out.println(book);
        } else {
            System.out.println("Book not found!");
        }

        // Remove a book
        System.out.println("\nRemove book with ID 103:");
        library.removeBook(103);

        // Display all books again
        System.out.println("\nAll Books after removing book with ID 103:");
        library.displayBooks();
    }

}
