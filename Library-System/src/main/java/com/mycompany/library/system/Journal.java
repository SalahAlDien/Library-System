package com.mycompany.library.system;
import java.util.Date;

class Journal extends Book {
    private String conferenceName;
    private int conferenceNo;

    public Journal(String title, String author, int no, String genre, int version,String conferenceName, int conferenceNo) {
        super(title, author, no, genre, version);
        this.conferenceName = conferenceName;
        this.conferenceNo = conferenceNo;
    }

    @Override
    public String toString() {
        return "Journal{ " + super.getInfo() + " , conferenceName=" + conferenceName + ", conferenceNo=" + conferenceNo + '}';
    }

    public String getConferenceName() {
        return conferenceName;
    }

    public void setConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
    }

    public int getConferenceNo() {
        return conferenceNo;
    }

    public void setConferenceNo(int conferenceNo) {
        this.conferenceNo = conferenceNo;
    }
    
}
