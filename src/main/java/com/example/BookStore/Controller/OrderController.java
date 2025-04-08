package com.example.BookStore.Controller;

import com.example.BookStore.Model.OrderModel;
import com.example.BookStore.Repositories.OrderRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.List;

/**
 * A Rest controller for order entity.
 */
@RequestMapping({ "/api/order" })
public class OrderController {
    private final OrderRepository orderRepository;

    /**
     * Parameterized constructor
     * 
     * @param orderRepository
     */
    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    /**
     * Method to get a list of orders.
     * 
     * @return a list of orders.
     */
    @GetMapping
    public List<OrderModel> getAllOrders() {
        return orderRepository.findAll();
    }

    /**
     * Method to get an order by id
     * 
     * @param id order's id
     * @return the order entity wrapped around ResponseEntity
     */
    @GetMapping({ "/id" })
    public ResponseEntity<OrderModel> getOrderById(@PathVariable Long id) {
        return orderRepository.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    /**
     * Method to create new order object
     * 
     * @param order the new order to be created.
     * @return new order entity.
     */
    @PostMapping
    public OrderModel createOrder(@RequestBody OrderModel order) {
        return orderRepository.save(order);
    }

    /**
     * Method to update existing order.
     * 
     * @param id          order's id.
     * @param updateOrder
     * 
     * @return updated order details
     */
    @PutMapping
    public ResponseEntity<OrderModel> updateOrder(@PathVariable Long id, @RequestBody OrderModel updateOrder) {
        return orderRepository.findById(id).map(order -> {
            order.setOrderDate(updateOrder.getOrderDate());
            order.setOrderType(updateOrder.getOrderType());
            OrderModel savedOrder = orderRepository.save(order);
            return ResponseEntity.ok(savedOrder);
        }).orElse(ResponseEntity.notFound().build());
    }

    /**
     * A method to Delete the order by id.
     * 
     * @param the order's id.
     * @return a Http status of 204 if deletion is successful.
     */
    @DeleteMapping("{/id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable Long id) {
        if (orderRepository.existsById(id)) {
            orderRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
