package com.mycompany.library.system;
import java.util.Date;

class Book implements Display {
    private String title;
    private String author;
    private String no;
    private String genre;
    private int version;
    private Date date;
    private boolean available = true; 

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    

    public Book(String title, String author, String no, String genre, int version) {
        this.title = title;
        this.author = author;
        this.no = no;
        this.genre = genre;
        this.version = version;
       }

    @Override
    public String getInfo() {
        return "Book: " + title + " by " + author;
    }

    @Override
    public boolean inLoan() {
        return false;
    }
}
