package com.example.BookStore.Controller;

import com.example.BookStore.Repositories.CustomerRepository;
import com.example.BookStore.Model.CustomerModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Rest controller for managing customer entity.
 */
@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    private final CustomerRepository customerRepository;

    /**
     * Parameterized constructor
     * 
     * @param customerRepository
     */
    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    /**
     * A method to return a list of the customers
     * 
     * @return list of all customers
     */
    @GetMapping
    public List<CustomerModel> getAllCustomers() {
        return customerRepository.findAll();
    }

    /**
     * A method to get a customer by the id
     * 
     * @param id the customer's id
     * @return the customer entity wrapped in ResponseEntity.
     */
    @GetMapping({ "/id" })
    public ResponseEntity<CustomerModel> getCustomerById(@PathVariable Long id) {
        return customerRepository.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    /**
     * A method used to create a customer object.
     * 
     * @param customer the entity to be created
     * @return the created customer entity
     */
    @PostMapping
    public CustomerModel createCustomer(@RequestBody CustomerModel customer) {
        return customerRepository.save(customer);
    }

}
