package com.example.BookStore.DTO;

import java.util.Date;

/**
 * A record containing Book details.
 */
public record BookSummary(
        Long id,
        String author,
        String name,
        String category,
        Date datePublished) {
}
