package com.mycompany.library.system;
import java.util.Date;

class Author {
    private int id;
    private String name;
    private String address;
    private Date birthDate;

    public Author(int id, String name, String address, Date birthDate) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }
}
