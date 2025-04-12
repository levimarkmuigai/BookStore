package com.example.BookStore.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.util.*;

/**
 * Class to track order details
 */
@Entity
@Table(name = "Order")
public class OrderModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; // for the order's Id

    @Column(name = "Date", nullable = false)
    @Positive(message = "Date should be a positive number (e.g., timezone).")
    @NotNull(message = "The date should not be empty.")

    private Date orderDate; // for the order's date

    /**
     * Default constructor
     * Empty for Jpa
     */
    public OrderModel() {
    }

    /**
     * Parameterized constractor
     * 
     * @param orderDate
     */
    public OrderModel(Date orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * Getters and Setters for the order's details
     * 
     * @param id
     * @param orderDate
     */

    /**
     * Getter for the order's date.
     * 
     * @param id
     * @return order's id
     */
    public long getId() {
        return this.id;
    }

    /**
     * Getter for the order's date.
     * 
     * @param orderDate
     * 
     * @return order's Date
     */
    public Date getOrderDate() {
        return this.orderDate;
    }

    /**
     * Setter for the order's Date
     * 
     * @param orderDate
     */
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
