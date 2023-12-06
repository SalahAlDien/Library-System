package com.mycompany.library.system;
import java.util.ArrayList;
import java.util.Date;
class Library {
    private ArrayList<Book> books;
    private ArrayList<Student> students; 

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    
    public void AddStudent(Student student){
        students.add(student); 
    }

    public Library() {
        this.books = new ArrayList<Book>();
        this.students = new ArrayList<Student>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean loanBook(Student student, Book book) {
        if(book.isAvailable() == false)
        {
            System.out.println("The Book isn't Available");
            return false; 
        }
        book.setAvailable(false);
        student.addLoan(new Loan(student,book,new Date()));
        return true; 
    }

    public void ShowStudentLoans(){
       for(Student s : students)
       {
           for(Loan n : s.getLoans())
           {
               System.out.println(n.toString());
           }
       }
    }
    public boolean returnBook(Student student, Book book) {
        return false;
    }

    public String displayBooks() {
        return "List of Books: ...";
    }
    
    public ArrayList<Book> SearchAvailableBooks(){
        ArrayList<Book> stored= new ArrayList<Book>(); 
        for(Book b : books)
        {
            if(b.isAvailable())
                stored.add(b);
        }
        return stored; 
    }
    public Book SearchBookByTitle(String title){
        for(Book b : books)
            if(b.getTitle().equals(title)){
                System.out.println(title + " Book Found");
                return b; 
            }
        return null; 
    } 
    public Book SearchBookByNumber(String number){
        for(Book b : books)
            if(b.getNo().equals(number)){
                System.out.println(b.getTitle() + " Book Found");
                return b;
            }
        return null; 
    } 
    public Book SearchBookByAuthor(String author){
        for(Book b : books)
            if(b.getAuthor().equals(author)){
                System.out.println(b.getTitle() + "Book Found");
                return b;
            }
        return null; 
    } 
}
