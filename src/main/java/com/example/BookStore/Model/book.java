package com.example.BookStore.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String category;

    private long datePublished;

    // Empty constractor required by JPA
    public book(){}

    // Parameterized constractor
    public book(String name, String category, long datePublished){
        this.name = name;
        this.category = category;
        this.datePublished = datePublished;
    }

    /*
     * Getters and Setters for books details.
     * @param book
     * @return book details
     */

    // Getter for id
    public long getId(){
        return this.id;
    }

    // Getter for name
    public String getName(){
        return this.name;
    }

    // Setter for name
    public void setName(String name){
        this.name = name;
    }

    // Getter for category
    public String getCategory(){
        return this.category;
    }

    // Setter for category
    public void setCategory(String category){
        this.category = category;
    }

    // Getter for published
    public long getDatePublished(){
        return this.datePublished;
    }

    // Setter for published
    public void setDatePublished(long datePublished){
        this.datePublished = datePublished;
    }

}
