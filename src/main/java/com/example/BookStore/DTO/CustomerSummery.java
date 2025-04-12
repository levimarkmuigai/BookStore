package com.example.BookStore.DTO;

/**
 * Consists of the details for a single customer.
 */
public record CustomerSummery(
    Long id,
    String firstName,
    String middleName,
    String lastName,
    String userName,
    String email,
    Long phoneNumber,
    String gender
){}
