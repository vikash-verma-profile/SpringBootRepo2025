package com.demo.customer_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.customer_service.model.*;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	Customer findByEmail(String email);
}
