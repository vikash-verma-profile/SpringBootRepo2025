package com.demo.customer_service.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.customer_service.model.Customer;
import com.demo.customer_service.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repo;

	public List<Customer> getAllCustomers() {
		return repo.findAll();
	}

	public Optional<Customer> getCustomerById(Long id) {
		return repo.findById(id);
	}

	public Customer saveCustomer(Customer customer) {
		return repo.save(customer);
	}

	public void deleteCustomer(Long id) {
		repo.deleteById(id);
	}
}
