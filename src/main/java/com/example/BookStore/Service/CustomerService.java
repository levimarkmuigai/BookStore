package com.example.BookStore.Service;

import com.example.BookStore.DTO.CustomerSummery;
import com.example.BookStore.Model.CustomerModel;
import com.example.BookStore.Repositories.CustomerRepository;
import org.springframework.stereotype.Service;

/**
 * Class that generates a list of customer's details.
 */
@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    /**
     * A method to generate a summery of customer details
     * 
     * @param id customer's id
     * @return summery for a customers details
     */
    public CustomerSummery generateCustomerDetails(Long id) {
        CustomerModel customer = customerRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Customer not found."));

        return new CustomerSummery(
                customer.getId(),
                customer.getFirstName(),
                customer.getMiddleName(),
                customer.getLastName(),
                customer.getUserName(),
                customer.getEmail(),
                customer.getPhoneNumber(),
                customer.getGender());
    }
}
