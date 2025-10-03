package com.demo.customer_service.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.demo.customer_service.service.*;
import com.demo.customer_service.model.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CustomerService service;

	@GetMapping
	public List<Customer> getAllCustomers() {
		return service.getAllCustomers();
	}

	@GetMapping("/{id}")
	public Optional<Customer> getCustomerById(@PathVariable Long id) {
		return service.getCustomerById(id);
	}

	@PostMapping
	public Customer saveCustomer(@RequestBody Customer customer) {
		return service.saveCustomer(customer);
	}

	@DeleteMapping("/{id}")
	public String deleteCustomer(@PathVariable Long id) {
		service.deleteCustomer(id);
		return "Customer deleted successfully";
	}
}
