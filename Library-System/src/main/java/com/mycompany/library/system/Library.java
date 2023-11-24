package com.mycompany.library.system;
import java.util.ArrayList;
class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean loanBook(Student student, Book book) {
        return false;
    }

    public boolean returnBook(Student student, Book book) {
        return false;
    }

    public String displayBooks() {
        return "List of Books: ...";
    }
}