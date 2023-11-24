package com.mycompany.library.system;
import java.util.Date;

class Book implements Display {
    private String title;
    private Author author;
    private String no;
    private String genre;
    private int version;
    private Date date;

    public Book(String title, Author author, String no, String genre, int version, Date date) {
        this.title = title;
        this.author = author;
        this.no = no;
        this.genre = genre;
        this.version = version;
        this.date = date;
    }

    @Override
    public String getInfo() {
        return "Book: " + title + " by " + author.getName();
    }

    @Override
    public boolean inLoan() {
        return false;
    }
}
