
package com.mycompany.library.system;

import java.util.Scanner;

public class LibrarySystem {

    public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);
              Library lib = new Library();
        while (true) {
            System.out.println("Console Menu");
            System.out.println("1. Show All Books");
            System.out.println("2. Show All Students");
            System.out.println("3. Add Book ");
            System.out.println("4. Add Student ");
            System.out.println("5. Search Book by title ");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for(Book b : lib.getBooks())
                    {
                        System.out.println(b.getInfo());
                    }
                    break;
                case 2:
                    for(Student b : lib.getStudents())
                    {
                        System.out.println(b.getInfo());
                    }
                    break;
                case 3:
                      System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();

        System.out.print("Enter Author Name: ");
        String authorName = scanner.nextLine();

        System.out.print("Enter Book Number: ");
        String bookNumber = scanner.nextLine();

        System.out.print("Enter Book Genre: ");
        String genre = scanner.nextLine();

        System.out.print("Enter Book Version: ");
        int version = scanner.nextInt();

        Book book = new Book(title, authorName, bookNumber, genre, version);
        lib.addBook(book);
                    System.out.println("Book Has been Added");
                    System.out.println("==============================");
                    break;
                     case 4:
                    System.out.print("Enter Student ID: ");
        int studentId = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Student Address: ");
        String studentAddress = scanner.nextLine();
        
        System.out.print("Enter Student Major: ");
        String studentMajor = scanner.nextLine();

        Student student = new Student(studentId, studentName, studentAddress, studentMajor);
        lib.AddStudent(student);
                         System.out.println("Student Adde");
        System.out.println("Student Created:\n" + student);
                    break;
                     case 5:
                     title = scanner.nextLine();
                  for(Book b : lib.getBooks()){
                      if(b.getTitle().equals(title))
                          System.out.println(b.getInfo());
                  }
                    break;
                case 6:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }

            System.out.println();
    }
    }
}





