package com.example.BookStore.Service;

import org.springframework.stereotype.Service;

import com.example.BookStore.DTO.BookSummery;
import com.example.BookStore.Repositories.BookRepository;
import com.example.BookStore.Model.BookModel;

/**
 * A class that generates a book's details.
 */
@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    /**
     * A method to generate a new summery of book details
     * 
     * @param id the book's id
     * 
     * @return a summery of the book details
     */
    public BookSummery generateBookDetails(Long id) {
        BookModel book = bookRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Book not found."));

        return new BookSummery(
                book.getId(),
                book.getName(),
                book.getAuthor(),
                book.getCategory(),
                book.getDatePublished());
    }
}
