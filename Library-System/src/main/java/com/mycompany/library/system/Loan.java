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

    @Override
    public String getInfo() {
        return "Loan: " + book.getInfo() + " Due Date: " + dueDate.toString();
    }

    @Override
    public boolean inLoan() {
        return !dueDate.before(new Date());
    }
}
