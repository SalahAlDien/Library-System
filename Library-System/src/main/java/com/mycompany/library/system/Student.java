package com.mycompany.library.system;
import java.util.Date;
import java.util.ArrayList; 

class Student implements Display {
    private int id;
    private String name;
    private String address;
    private Date birthDate;
    private String major;
    private ArrayList<Loan> loans;

    public Student(int id, String name, String address, Date birthDate, String major) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.birthDate = birthDate;
        this.major = major;
        this.loans = new ArrayList<Loan>();
    }

    @Override
    public String getInfo() {
        return "Student: " + name + ", Major: " + major;
    }

    @Override
    public boolean inLoan() {
        return !loans.isEmpty();
    }
}