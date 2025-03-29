package com.example.BookStore.Repositories;

import org.springframework.data.jpa.repository.JpaRepository; 
import com.example.BookStore.Model.bookModel;
import org.springframework.stereotype.Repository;

@Repository
public interface bookRepository extends JpaRepository<bookModel, Long>{

}
