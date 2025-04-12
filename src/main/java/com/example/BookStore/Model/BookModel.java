package com.example.BookStore.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.util.Date;

/*
 * Class BookModel which stores a book's details
 */
@Entity
@Table(name = "book")
public class BookModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Author", nullable = false)
    @Size(min = 1, max = 100, message = "Author name must be between 1 and 100 Characters.")
    @NotNull(message = "Author name cannot be empty.")
    @NotEmpty

    private String author;

    @Column(name = "Name", nullable = false)
    @Size(min = 1, max = 100, message = "Book name must be between 1 and 100 Characters.")
    @NotNull(message = "Book name cannot be empty.")
    @NotEmpty

    private String name;

    @Column(name = "Category")
    @Size(max = 50, message = "Book cannot be longer than 50 Characters.")

    private String category;

    @Column(name = "Published", nullable = false)
    @Positive(message = "Publication date must be a positive number (e.g., timestamp)")
    @NotNull(message = "Publication date should not be empty.")
    @NotEmpty
    private Date datePublished;

    /**
     * Default constructor
     * Required empty for JPA
     */
    public BookModel() {
    }

    /**
     * Class constructor
     * 
     * @param name          the books name
     * @param category      the category of the book
     * @param datePublished the publish date for the book
     * @param author        the Author of the book
     */
    public BookModel(String name, String category, Date datePublished, String author) {
        this.name = name;
        this.category = category;
        this.datePublished = datePublished;
        this.author = author;
    }

    /**
     * Getters and Setters for books details.
     * 
     * @param name          the books name
     * @param author        the books Author
     * @param category      the books category
     * @param datePublished the publish date for the book
     * @return book details
     */

    /**
     * Getter for the id
     * 
     * @param id the book's id
     * 
     * @return the books id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Getter for the book's name
     * 
     * @param name for the books name
     * @return the book's name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for the book's name
     * 
     * @param bookName
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for the book's category
     * 
     * @param category
     * @return the book's category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * Setter for the book's category
     * 
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Getter for the datePublished
     * 
     * @param datePublished
     * 
     * @return book's date of publish
     */
    public Date getDatePublished() {
        return this.datePublished;
    }

    /**
     * Setter for the datePublished
     * 
     * @param datePublished
     */
    public void setDatePublished(Date datePublished) {
        this.datePublished = datePublished;
    }

    /**
     * Getter for the book's author
     * 
     * @param author
     * @return the name of the book's Author
     */
    public String getAuthor() {
        return this.author;
    }

    /**
     * Setter for book's author
     * 
     * @param author the Author of the book
     */
    public void setAuthor(String author) {
        this.author = author;
    }
}
