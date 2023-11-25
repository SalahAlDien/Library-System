# Library-System

Hamza Said : 211184
Salah AL Dien : 227844

+------------------+         +-------------------+
|     Library      |         |      Display      |
+------------------+         +-------------------+
| - books: List<Book>|         | <<interface>>    |
+------------------+         | - getInfo(): String |
| + addBook(Book): void  |   | - inLoan(): boolean |
| + loanBook(Student, Book): boolean |
| + returnBook(Student, Book): boolean |
| + displayBooks(): String |
+------------------+
        |
        V
+------------------+
|       Book       |
+------------------+
| - title: String  |
| - author: Author |
| - no: String      |
| - genre: String   |
| - version: int    |
| - date: Date      |
+------------------+
| + getInfo(): String |
| + inLoan(): boolean |
+------------------+
        ^
        |
+------------------+
|   Magazine    |
+------------------+
| - issueNo: int   |
| - releaseDate: Date|
+------------------+
| + getInfo(): String |
| + inLoan(): boolean |
+------------------+
        ^
        |
+------------------+
|    Journal     |
+------------------+
| - conferenceName: String|
| - conferenceNo: int    |
+------------------+
| + getInfo(): String |
| + inLoan(): boolean |
+------------------+
        |
        V
+------------------+
|     Author     |
+------------------+
| - id: int        |
| - name: String   |
| - address: String|
| - birthDate: Date|
+------------------+
| + getInfo(): String |
+------------------+
        |
        V
+------------------+
|    Student     |
+------------------+
| - id: int        |
| - name: String   |
| - address: String|
| - birthDate: Date|
| - major: String  |
| - loans: List<Loan>|
+------------------+
| + getInfo(): String |
| + inLoan(): boolean |
+------------------+
        |
        V
+------------------+
|      Loan      |
+------------------+
| - student: Student|
| - book: Book     |
| - dueDate: Date  |
+------------------+
| + getInfo(): String |
| + inLoan(): boolean |
+------------------+
