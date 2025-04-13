package com.example.BookStore.View;

import com.example.BookStore.DTO.OrderSummary;
import com.example.BookStore.Service.*;
import com.example.BookStore.Repositories.OrderRepository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * A class that generates the details
 * for an order in json formart.
 */
public class OrderView {

    private final OrderRepository orderRepository;
    private final OrderService orderService;

    public OrderView(OrderRepository orderRepository, OrderService orderService) {
        this.orderRepository = orderRepository;
        this.orderService = orderService;
    }

    @GetMapping("/api/orderreport")
    public List<OrderSummary> getOrderReport(Long id) {
        return orderRepository.findById(id).stream().map(order -> orderService.generateOrderDetails(order.getId()))
                .collect(Collectors.toList());
    }
}
