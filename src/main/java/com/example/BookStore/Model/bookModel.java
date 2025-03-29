package com.example.BookStore.Model;



import jakarta.persistence.*;


/*
 * Class bookModel which stores a books details
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
     * Class constractor
     * Required empty constractor for JPA
    */
    public bookModel(){}

    /**
     * Class constractor
     * 
     * @param bookname
     * @param bookCategory
     * @param datePublished
     * @param bookAuthor
     * */ 
    public bookModel(String bookName, String bookCategory, long datePublished, String bookAuthor){
        this.bookName = bookName;
        this.bookCategory = bookCategory;
        this.datePublished = datePublished;
        this.bookAuthor = bookAuthor;
    }

    /*
     * Getters and Setters for books details.
     * @param bookName
     * @param bookAuthor
     * @param bookCategory
     * @param datePublished
     * @return book details
     */

    /**
     * Getter for the id
     * 
     * @param id
     */ 
    public long getId(){
        return this.id;
    }

    /**
     * Getter for the bookName
     * 
     * @param bookName
     * @return bookName
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
     * Getter fot the bookCategory
     * 
     * @param bookCategory
     * @return bookCategory
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
     * @return datePublished
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
     * @return bookAuthor 
        */
    public String getBookAuthor(){
        return this.bookAuthor;
    }

    /**
     * Setter for bookAuthor
     * @param bookAuthor
     */
    public void setBookAuthor(String bookAuthor){
        this.bookAuthor = bookAuthor;
    }
}
