package com.guvi.task3;

public class Library {
	

	    private Book[] books;
	    private int numBooks;

	    public Library() {
	        this.books = new Book[5];
	        this.numBooks = 0;
	    }

	    public void addBook(Book book) {
	        if (numBooks == books.length) {
	            System.out.println("Library is full!");
	            return;
	        }
	        books[numBooks++] = book;
	    }

	    public void removeBook(int bookID) {
	        boolean found = false;
	        for (int i = 0; i < numBooks; i++) {
	            if (books[i].getBookID() == bookID) {
	                found = true;
	                if (i < numBooks - 1) {
	                    // Shift books to the left to overwrite the removed book
	                    for (int j = i; j < numBooks - 1; j++) {
	                        books[j] = books[j + 1];
	                    }
	                }
	                numBooks--;
	                break;
	            }
	        }
	        if (!found) {
	            System.out.println("Book not found!");
	        }
	    }

	    public Book searchBook(int bookID) {
	        for (int i = 0; i < numBooks; i++) {
	            if (books[i].getBookID() == bookID) {
	                return books[i];
	            }
	        }
	        return null;
	    }

	    public void displayBooks() {
	        for (int i = 0; i < numBooks; i++) {
	            System.out.println(books[i]);
	        }
	    }
	}
