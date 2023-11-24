package com.mycompany.library.system;
import java.util.Date;

class Magazine extends Book {
    private int issueNo;
    private Date releaseDate;

    public Magazine(String title, Author author, String no, String genre, int version, Date date,
                    int issueNo, Date releaseDate) {
        super(title, author, no, genre, version, date);
        this.issueNo = issueNo;
        this.releaseDate = releaseDate;
    }
}