package com.mycompany.library.system;
import java.util.Date;

class Magazine extends Book {
    private int issueNo;
    private Date releaseDate;

    public Magazine(String title, String author, String no, String genre, int version, Date date,
                    int issueNo, Date releaseDate) {
        super(title, author, no, genre, version);
        this.issueNo = issueNo;
        this.releaseDate = releaseDate;
    }
}
