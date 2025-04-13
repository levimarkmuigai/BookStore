package com.example.BookStore.View;

import com.example.BookStore.Service.CustomerService;
import com.example.BookStore.Repositories.CustomerRepository;
import com.example.BookStore.DTO.CustomerSummary;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * A class that displays a customer's details in Json format.
 */
public class CustomerView {

    private final CustomerRepository customerRepository;
    private final CustomerService customerService;

    public CustomerView(CustomerRepository customerRepository,
            CustomerService customerService) {

        this.customerRepository = customerRepository;
        this.customerService = customerService;
    }

    /**
     * Returns a report for a customer's details
     * 
     * @return a List of customer's details
     */
    @GetMapping("/api/customerreport")
    public List<CustomerSummary> getCustomerReport(Long id) {
        return customerRepository.findById(id)
                .stream()
                .map(
                        customer -> customerService.generateCustomerDetails(customer.getId()))
                .collect(Collectors.toList());
    }
}
