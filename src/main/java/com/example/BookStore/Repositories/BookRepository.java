package com.example.BookStore.Repositories;

import org.springframework.data.jpa.repository.JpaRepository; 
import com.example.BookStore.Model.BookModel;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookModel, Long>{

}
