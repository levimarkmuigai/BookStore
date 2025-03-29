package com.example.BookStore.Model;

import jakarta.persistence.*;

import java.util.*;

/**
 * Class to track order details
 */
@Entity
@Table(name = "Order")
public class OrderModel {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id; // for the order's Id

    private Date orderDate; // for the order's date

    private String orderType; // for the order's type

    /**
     * Default constructor 
     * Empty for Jpa
     */
    public OrderModel(){}

    /**
     * Parameterized constractor 
     * 
     * @param orderDate
     * @param orderType
     */
    public OrderModel(Date orderDate, String orderType){
        this.orderDate = orderDate;
        this.orderType = orderType;
    }

    /**
     * Getters and Setters for the order's details
     * 
     * @param id
     * @param orderDate
     * @param orderType
     */

    /**
     * Getter for the order's date.
     * 
     * @param id
     * @return order's  id
     */
    public long getId(){
        return this.id;
    }

    /**
     * Getter for the order's date.
     * 
     * @param orderDate
     * 
     * @return order's Date 
     */
    public Date getOrderDate(){
        return this.orderDate;
    }

    /**
     * Setter for the order's Date
     * 
     * @param orderDate
     */
    public void setOrderDate(Date orderDate){
        this.orderDate = orderDate;
    }

    /**
     * Getter for the order's Type
     * 
     * @param orderType
     * 
     * @return order's type
     */
    public String getOrderType(){
        return this.orderType;
    }

    /**
     * Setter for the order's type
     * 
     * @param orderType
     */
    public void setOrderType(String orderType){
        this.orderType = orderType;
    }
}
