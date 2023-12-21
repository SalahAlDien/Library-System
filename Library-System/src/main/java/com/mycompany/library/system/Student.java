package com.mycompany.library.system;
import java.util.Date;
import java.util.ArrayList; 

class Student implements Display {
    private int id;
    private String name;
    private String address;
    private String major;
    private ArrayList<Loan> loans;
    private ArrayList<Book> books; 

    public void addBook(Book book)
    {
        books.add(book); 
    }
    
    public void addLoan(Loan loan)
    {
        loans.add(loan);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public ArrayList<Loan> getLoans() {
        return loans;
    }

    public void setLoans(ArrayList<Loan> loans) {
        this.loans = loans;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public Student(int id, String name, String address, String major) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.major = major;
        this.loans = new ArrayList<Loan>();
        this.books = new ArrayList<Book>(); 
    }
    

    @Override
    public String getInfo() {
        return "Student: " + "[ "+ name + ", Major: " + major + " , Has Loans : " + this.inLoan() + " ]";
    }

    @Override
    public boolean inLoan() {
        return !loans.isEmpty();
    }
    
    
}
