package com.example.BookStore.Repositories;

import com.example.BookStore.Model.CustomerModel;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CustomerRepository  extends JpaRepository<CustomerModel, Long>{

}
