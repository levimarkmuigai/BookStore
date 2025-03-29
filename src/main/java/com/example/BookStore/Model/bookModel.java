package com.example.BookStore.Model;



import jakarta.persistence.*;


/*
 * Class bookModel which stores a book's details
 */
@Entity
@Table(name = "book")
public class bookModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String bookAuthor;

    private String bookName;

    private String bookCategory;

    private long datePublished;

    /**
     * Default constructor
     * Required empty for JPA
    */
    public bookModel(){}

    /**
     * Class constructor
     * 
     * @param bookname the books name
     * @param bookCategory the category of the book
     * @param datePublished the publish date for the book
     * @param bookAuthor the Author of the book
     * */ 
    public bookModel(String bookName, String bookCategory, long datePublished, String bookAuthor){
        this.bookName = bookName;
        this.bookCategory = bookCategory;
        this.datePublished = datePublished;
        this.bookAuthor = bookAuthor;
    }

    /**
     * Getters and Setters for books details.
     * @param bookName the books name
     * @param bookAuthor the books Author
     * @param bookCategory the books category
     * @param datePublished the publish date for the book
     * @return book details
     */

    /**
     * Getter for the id
     * 
     * @param id the books Id
     * 
     * @return the nooks id
     */ 
    public long getId(){
        return this.id;
    }

    /**
     * Getter for the bookName
     * 
     * @param bookName for the books name
     * @return the  book's name
     */
    public String getBookName(){
        return this.bookName;
    }

    /**
     * Setter for the bookName
     * 
     * @param bookName
     */ 
    public void setBookName(String bookName){
        this.bookName = bookName;
    }

    /**
     * Getter for the bookCategory
     * 
     * @param bookCategory
     * @return the book's category
    */
    public String getBookCategory(){
        return this.bookCategory;
    }

    /**
     * Setter for the bookCategory
     * @param bookCategory
     */
    public void setBookCategory(String bookCategory){
        this.bookCategory = bookCategory;
    }

    /**
     * Getter for the datePublished
     * @param datePublished
     * 
     * @return book's date of publish
      */ 
    public long getDatePublished(){
        return this.datePublished;
    }

    /**
     * Setter for the datePublished
     * @param datePublished
    */
    public void setDatePublished(long datePublished){
        this.datePublished = datePublished;
    }

    /**
     * Getter for the bookAuthor
     * @param bookAuthor
     * @return the name of the book's Author 
        */
    public String getBookAuthor(){
        return this.bookAuthor;
    }

    /**
     * Setter for bookAuthor
     * @param bookAuthor the Author of the book
     */
    public void setBookAuthor(String bookAuthor){
        this.bookAuthor = bookAuthor;
    }
}
