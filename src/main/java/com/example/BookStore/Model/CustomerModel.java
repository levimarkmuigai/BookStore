package com.example.BookStore.Model;

import jakarta.persistence.*;

/**
 * Class CustomerModel for the Customer's details.
 */
@Entity
@Table(name = "Customer")
public class CustomerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; // For the customer's id

    private String customerUserName; // For the customer's username

    private String customerEmail; // For the customer's email

    private long customerPhoneNumber; // For the customer's phonenumber

    private String customerGender; // For the customer's gender

    /**
     * Default constructor
     * 
     * Empty for JPA
     */
    public CustomerModel(){}

    /**
     * Parameterized class constructor.
     * 
     * @param customerUserName 
     * @param customerEmail
     * @param customerPhoneNumber
     * @param customerGender
     * 
     * @return customer's  username
     * @return customer's email
     * @return customer's phonenumber
     * @return customer's gender
     */
    public CustomerModel(String customerUserName, String customerEmail, 
                        long customerPhoneNumber, String customerGender){
        this.customerUserName = customerUserName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerGender = customerGender;
    }

    /**
     * Getters and Setters for Customer's details
     * 
     * @param customerUserName
     * @param customerEmail
     * @param customerPhoneNumber
     * @param customerGender
     * 
     * @return customer's details
     */

    /**
     * Getter for Customer's username
     * 
     * @param customerUserName
     *
     * return customer's username
     */
    public String getCustomerUserName(){
        return this.customerUserName;
    }

    /**
     * Setter for Customer's username
     * 
     * @param customerUserName
     */
    public void setCustomerUserName(String customerUserName){
        this.customerUserName = customerUserName;
    }

    /**
     * Getter for Customer's email
     * 
     * @param customerEmail
     * 
     * @return customer's email
     */
    public String getCustomerEmail(){
        return this.customerEmail;
    }

    /**
     * Setter for Customer's email
     * 
     * @param customerEmail
     */
    public void setCustomerEmail(String customerEmail){
        this.customerEmail = customerEmail;
    }

    /**
     * Getter for Customer's phonenumber 
     * 
     * @param customerPhoneNumber
     * 
     * @return customer's phonenumber
     */
    public long getCustomerPhoneNumber(){
        return this.customerPhoneNumber;
    }

    /**
     * Setter for customer's phonenumber
     * 
     * @param customerPhoneNumber
     */
    public void setCustomerPhoneNumber(long customerPhoneNumber){
        this.customerPhoneNumber = customerPhoneNumber;
    }

    /**
     * Getter for customer's gender
     * 
     * @param customerGender
     * 
     * @return customer's gender
     */
    public String getCustomerGender(){
        return this.customerGender;
    }

    /**
     * Setter for customer's gender
     * 
     * @param customerGender
     */
    public void setCustomerGender(String customerGender){
        this.customerGender = customerGender;
    }
}
