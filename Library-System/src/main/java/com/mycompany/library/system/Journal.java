package com.mycompany.library.system;
import java.util.Date;

class Journal extends Book {
    private String conferenceName;
    private int conferenceNo;

    public Journal(String title, Author author, String no, String genre, int version, Date date,
                   String conferenceName, int conferenceNo) {
        super(title, author, no, genre, version, date);
        this.conferenceName = conferenceName;
        this.conferenceNo = conferenceNo;
    }
}
