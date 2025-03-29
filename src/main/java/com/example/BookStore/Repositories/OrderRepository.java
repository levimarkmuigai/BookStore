package com.example.BookStore.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.BookStore.Model.OrderModel;

@Repository
public interface OrderRepository extends JpaRepository<OrderModel, Long>{

}
