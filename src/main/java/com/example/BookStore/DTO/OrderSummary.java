package com.example.BookStore.DTO;

import java.util.Date;

/**
 * Record to show order details.
 */
public record OrderSummary(
        Long id,
        Date date) {

}
