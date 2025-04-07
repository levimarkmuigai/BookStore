package com.example.BookStore.Controller;

import com.example.BookStore.Model.BookModel;
import com.example.BookStore.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for managing book entity.
 */
@RestController
@RequestMapping("/api/book")
public class BookController {

  private final BookRepository bookRepository;

  @Autowired
  public BookController(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  /**
   * Returns a list of all books
   * 
   * @return a list of book objects
   */
  @GetMapping
  public List<BookModel> getAllBooks() {
    return bookRepository.findAll();
  }

  /**
   * Get book entity by the Id
   * 
   * @param id the book's id
   * @return employee object wrapped in Response entity
   */
  @GetMapping({ "/id" })
  public ResponseEntity<BookModel> getBookById(@PathVariable Long id) {
    return bookRepository.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
  }

  /**
   * Create a new book
   * 
   * @param book the book object to create
   * @return the created book entity
   */
  @PostMapping
  public BookModel createBook(@RequestBody BookModel bookModel) {
    return bookRepository.save(bookModel);
  }
}
