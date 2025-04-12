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

    private String customerUserName; // For the customer's username

    @Column(name = "Email", nullable = false)
    @Size(max = 255, message = "Email cannot be more than 255 characters.")
    @NotNull(message = "Email cannot be empty.")

    private String customerEmail; // For the customer's email

    @Column(name = "PhoneNumber", nullable = true)
    @Positive(message = "A phonenumber should be positive (e.g 0712345678).")

    private long customerPhoneNumber; // For the customer's phonenumber

    @Column(name = "Gender", nullable = false)
    @Size(max = 7, message = "Gender should not be more than 7 characters.")
    @NotNull(message = "Gender cannot be empty.")
    private String customerGender; // For the customer's gender

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
     * @param customerUserName
     * @param customerEmail
     * @param customerPhoneNumber
     * @param customerGender
     * 
     * @return customer's first name.
     * @return customer's middle name.
     * @return customer's last name.
     * @return customer's username
     * @return customer's email
     * @return customer's phonenumber
     * @return customer's gender
     */
    public CustomerModel(String customerUserName, String customerEmail,
            long customerPhoneNumber, String customerGender, String firstName,
            String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.customerUserName = customerUserName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerGender = customerGender;
    }

    /**
     * Getters and Setters for Customer's details
     * 
     * @param id
     * @param firstName
     * @param middleName
     * @param lastName
     * @param customerUserName
     * @param customerEmail
     * @param customerPhoneNumber
     * @param customerGender
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
     * @param customerUserName
     *
     * @return customer's username
     */
    public String getCustomerUserName() {
        return this.customerUserName;
    }

    /**
     * Setter for Customer's username
     * 
     * @param customerUserName
     */
    public void setCustomerUserName(String customerUserName) {
        this.customerUserName = customerUserName;
    }

    /**
     * Getter for Customer's email
     * 
     * @param customerEmail
     * 
     * @return customer's email
     */
    public String getCustomerEmail() {
        return this.customerEmail;
    }

    /**
     * Setter for Customer's email
     * 
     * @param customerEmail
     */
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    /**
     * Getter for Customer's phonenumber
     * 
     * @param customerPhoneNumber
     * 
     * @return customer's phonenumber
     */
    public long getCustomerPhoneNumber() {
        return this.customerPhoneNumber;
    }

    /**
     * Setter for customer's phonenumber
     * 
     * @param customerPhoneNumber
     */
    public void setCustomerPhoneNumber(long customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    /**
     * Getter for customer's gender
     * 
     * @param customerGender
     * 
     * @return customer's gender
     */
    public String getCustomerGender() {
        return this.customerGender;
    }

    /**
     * Setter for customer's gender
     * 
     * @param customerGender
     */
    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }
}
