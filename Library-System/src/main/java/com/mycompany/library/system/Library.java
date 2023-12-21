package com.mycompany.library.system;
import java.util.ArrayList;
import java.util.Date;
class Library {
    private ArrayList<Book> books;
    private ArrayList<Journal> journals;
    private ArrayList<Magazine> magazines;
    private ArrayList<Student> students; 

    public ArrayList<Journal> getJournals() {
        return journals;
    }

    public void setJournals(ArrayList<Journal> journals) {
        this.journals = journals;
    }

    public ArrayList<Magazine> getMagazines() {
        return magazines;
    }

    public void setMagazines(ArrayList<Magazine> magazines) {
        this.magazines = magazines;
    }

    
    
    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    
    public void AddStudent(Student student){
        students.add(student); 
    }
    
    public void AddJournal(Journal journal){
        journals.add(journal);
                
    }
    public void AddMagazine(Magazine magazine){
        magazines.add(magazine);
    }

    public Library() {
        this.books = new ArrayList<Book>();
        this.students = new ArrayList<Student>();
        this.journals = new ArrayList<Journal>(); 
        this.magazines = new ArrayList<Magazine>(); 
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

    public Loan loanBook(Student student, Book book) {
        if(book.isAvailable() == false)
        {
            System.out.println("The Book isn't Available");
            return null; 
        }
        book.setAvailable(false);
        Loan l = new Loan(student,book,new Date());
        student.addLoan(l);
        return l; 
    }

    public String ShowStudentLoans(){
        String res = ""; 
       for(Student s : students)
       {
           for(Loan n : s.getLoans())
           {
               res += n.toString() + "\n" + "=================================" + "\n";
           }
       }
       
       return res; 
    }
    
    public Student FindStudentById(int id){
        for(Student s : students)
       {
           if(s.getId() == id)
               return s; 
       }
        return null; 
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
    public Book SearchBookByNumber(int number){
        for(Book b : books)
            if(b.getNo() == number){
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
