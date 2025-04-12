package com.example.BookStore.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

/**
 * Class CustomerModel for the Customer's details.
 */
@Entity
@Table(name = "Customer")
public class CustomerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // For the customer's id

    @Column(name = "FirstName", nullable = false)
    @Size(max = 25, message = "Name should not exceed 25 characters.")
    @NotNull(message = "FirstName should not be empty.")

    private String firstName;

    @Column(name = "MiddleName")
    @Size(max = 25, message = "Name should not exceed 25 characters.")

    private String middleName;

    @Column(name = "LastName", nullable = false)
    @Size(max = 25, message = "Name should not exceed 25 characters.")
    @NotNull(message = "LastName should not be empty.")
    private String lastName;

    @Column(name = "UserName", nullable = false)
    @Size(min = 5, max = 55, message = "UserName should be between 5 and 55 characters.")
    @NotNull(message = "UserName cannot be empty.")

    private String userName; // For the customer's username

    @Column(name = "Email", nullable = false)
    @Size(max = 255, message = "Email cannot be more than 255 characters.")
    @NotNull(message = "Email cannot be empty.")

    private String email; // For the customer's email

    @Column(name = "PhoneNumber", nullable = true)
    @Positive(message = "A phonenumber should be positive (e.g 0712345678).")

    private Long phoneNumber; // For the customer's phonenumber

    @Column(name = "Gender", nullable = false)
    @Size(max = 7, message = "Gender should not be more than 7 characters.")
    @NotNull(message = "Gender cannot be empty.")

    private String gender; // For the customer's gender

    /**
     * Default constructor
     * 
     * Empty for JPA
     */
    public CustomerModel() {
    }

    /**
     * Parameterized class constructor.
     * 
     * @param firstName
     * @param middleName
     * @param lastName
     * @param userName
     * @param email
     * @param phoneNumber
     * @param gender
     * 
     * @return customer's first name.
     * @return customer's middle name.
     * @return customer's last name.
     * @return customer's username
     * @return customer's email
     * @return customer's phonenumber
     * @return customer's gender
     */
    public CustomerModel(String userName, String email,
            Long phoneNumber, String gender, String firstName,
            String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    /**
     * Getters and Setters for Customer's details
     * 
     * @param id
     * @param firstName
     * @param middleName
     * @param lastName
     * @param userName
     * @param email
     * @param phoneNumber
     * @param gender
     * 
     * @return customer's details
     */

    /**
     * Getter for the customer's id.
     * 
     * @return the customers id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Getter for the Customer's first name
     * 
     * @return customer's first name
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Setter for Customer's first name
     * 
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for the Customer's middle name
     * 
     * @return customer's middle name
     */
    public String getMiddleName() {
        return this.middleName;
    }

    /**
     * Setter for Customer's middle name
     * 
     * @param middleName
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * Getter for the Customer's last name
     * 
     * @return customer's last name
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Setter for Customer's last name
     * 
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter for Customer's username
     * 
     * @param userName
     *
     * @return customer's username
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * Setter for Customer's username
     * 
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Getter for Customer's email
     * 
     * @param email
     * 
     * @return customer's email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for Customer's email
     * 
     * @param customerEmail
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter for Customer's phonenumber
     * 
     * @param phoneNumber
     * 
     * @return customer's phonenumber
     */
    public Long getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Setter for customer's phonenumber
     * 
     * @param customerPhoneNumber
     */
    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Getter for customer's gender
     * 
     * @param gender
     * 
     * @return customer's gender
     */
    public String getGender() {
        return this.gender;
    }

    /**
     * Setter for customer's gender
     * 
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
}
