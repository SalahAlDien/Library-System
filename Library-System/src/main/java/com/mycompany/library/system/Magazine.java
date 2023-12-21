package com.mycompany.library.system;
import java.util.Date;

class Magazine extends Book {
    private int issueNo;

    public Magazine(String title, String author, int no, String genre, int version,
                    int issueNo) {
        super(title, author, no, genre, version);
        this.issueNo = issueNo;
    }

    @Override
    public String toString() {
        return "Magazine{ " + super.getInfo() + " , issueNo=" + issueNo + '}';
    }

    public int getIssueNo() {
        return issueNo;
    }

    public void setIssueNo(int issueNo) {
        this.issueNo = issueNo;
    }
    
    
}
