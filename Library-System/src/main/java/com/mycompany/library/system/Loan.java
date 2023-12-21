package com.mycompany.library.system;
import java.util.Date;

class Loan implements Display {
    private Student student;
    private Book book;
    private Date dueDate;

    public Loan(Student student, Book book, Date dueDate) {
        this.student = student;
        this.book = book;
        this.dueDate = dueDate;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String getInfo() {
        return "Loan: [" + " Book : " + book.getTitle() +  ", Student : " + student.getName() +", Due Date: " + dueDate.toString() +  " ] ";
    }

    @Override
    public boolean inLoan() {
        return !dueDate.before(new Date());
    }
}
