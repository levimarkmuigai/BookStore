package com.example.BookStore.Service;

import com.example.BookStore.DTO.OrderSummary;
import com.example.BookStore.Repositories.OrderRepository;
import com.example.BookStore.Model.OrderModel;

import org.springframework.stereotype.Service;

/**
 * A class that creates a new instance of an
 * order's summery.
 */
@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public OrderSummary generateOrderDetails(Long id) {
        OrderModel order = orderRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Order not found."));

        return new OrderSummary(
                order.getId(),
                order.getDate());
    }
}
