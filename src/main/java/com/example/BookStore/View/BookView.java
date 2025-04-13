package com.example.BookStore.View;

import com.example.BookStore.Service.BookService;
import com.example.BookStore.Repositories.BookRepository;
import com.example.BookStore.DTO.BookSummery;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * A class that prints a book's details in Json Format.
 */
public class BookView {
    public final BookRepository bookRepository;
    public final BookService bookService;

    public BookView(BookRepository bookRepository, BookService bookService) {
        this.bookRepository = bookRepository;
        this.bookService = bookService;
    }

    /**
     * A method that prints a book's details
     * in Json format.
     * 
     * @return a report of book's details.
     */
    @GetMapping("/api/bookreport")
    public List<BookSummery> getBookReport(Long id) {
        return bookRepository.findById(id).stream().map(book -> bookService.generateBookDetails(book.getId()))
                .collect(Collectors.toList());
    }
}
