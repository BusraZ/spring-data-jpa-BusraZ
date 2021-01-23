package com.hkarabakla.entities;
import javax.persistence.*;
import java.util.List;

@Entity
public class Author {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    @ManyToMany(mappedBy = "authors",fetch = FetchType.EAGER)
    private List<Book> registeredBooks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getRegisteredBooks() {
        return registeredBooks;
    }

    public void setRegisteredBooks(List<Book> registeredBooks) {
        this.registeredBooks = registeredBooks;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
